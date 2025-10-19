package com.psp.cmd.ls.grep.a.Lanzador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import com.psp.cmd.ls.grep.a.Grep_a.GrepA;
import com.psp.cmd.ls.grep.a.Ls.Ls;

public class Lanzador {
    
    private static final String MSG_ERROR = "Error de ejecución en el comando.";

    public static void main(String[] args) {

       try {
        Process lsProcess = Runtime.getRuntime().exec(Ls.LS);
        Process grepProcess = Runtime.getRuntime().exec(GrepA.GREP);

        procesos(lsProcess, grepProcess);
        salidaProcesos(grepProcess);

        int exitVal = grepProcess.waitFor();
        if (exitVal == 0) {
            System.exit(0);
        } else {
            System.out.println(MSG_ERROR);
            System.exit(1);
        }

       } catch (IOException | InterruptedException e) {
        System.err.println(e);
       }

    }

    private static void procesos(Process processLs, Process processGrep) throws IOException {
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(processLs.getInputStream()));
            PrintWriter pw = new PrintWriter(processGrep.getOutputStream());

            String line;
            while ((line = reader.readLine()) != null) {
                pw.append(line).append("\n");
            }

            pw.close();
    }

    private static void salidaProcesos(Process process) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.write((line + "\n").getBytes());
        }

    }
}
