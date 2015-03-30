package principal;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JuanCarlos
 */
import java.io.File;

public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path= "C:/Users/JuanCarlos/Documents/GitHub/Scanner/Scanner/src/scanner/data/lexer.flex";
        generarLexer(path);
        // TODO code application logic here
        
    }
    public static void generarLexer(String path){
        File file = new File(path);
        jflex.Main.generate(file);
    }
    
}
