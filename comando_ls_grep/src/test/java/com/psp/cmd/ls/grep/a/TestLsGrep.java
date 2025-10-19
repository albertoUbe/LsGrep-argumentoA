package com.psp.cmd.ls.grep.a;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

import com.psp.cmd.ls.grep.a.Grep_a.GrepA;
import com.psp.cmd.ls.grep.a.Ls.Ls;

public class TestLsGrep {

    @Test
    void testComandoLs() {
        String[] LsTest = {"ls"};
        assertArrayEquals(LsTest, Ls.LS, "El comando esperado es \"ls\".");
    }
    
    @Test
    void testComandoGrep() {
        String[] grepTest = {"grep", "a"};
        assertArrayEquals(grepTest, GrepA.GREP, "El comando esperado es \"grep a.\"");
    }

}
