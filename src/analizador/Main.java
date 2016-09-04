package analizador;

import java.io.File;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //replazar esta ruta por la ruta donde tengas tu archivo lexer.flex con las reglas lexicas
        String path = "C:\\Users\\vhern\\Documents\\ROSA\\AnalizadorLexico\\src\\analizador\\Lexer.flex";
        generarLexer(path);

    }
    public static void generarLexer(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
}
