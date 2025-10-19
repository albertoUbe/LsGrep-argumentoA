# 🗃️ Lanzador comando `ls | grep`

Escribir en la entrada de un proceso desde el programa padre.

Lanzar un proceso que ejecute el comando `ls` de Linux y conectará su salida como entrada del proceso hijo `grep`, con el argumento `"a"`.

Mostar la salida por consola.

La ejecución simula el comportamiento de la consola:

```bash
ls | grep java

---

## 📦 Estructura del Proyecto

📁 com.psp.cmd.ls.grep.a

    📁 Grep_a
  
      📄 GrepA.java

   📁 Ls
  
      📄 Ls.java
 
    📁 Lanzador
  
      📄 Lanzador.java

---

## 🧑‍💻 Ejecución

Compila y ejecuta el programa por consola con maven: desde la carpeta raíz donde se encuentra el `pom.xml`.

```bash
mvn clean compile `(desde target/classes)`
java -cp classes com.psp.cmd.ls.grep.a.Lanzador.Lanzador ```
```

Mostrara la siguiente lista:

> classes
>
> generated-sources
>
> maven-status
