
package scanner.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import javax.swing.JFileChooser;
import scanner.data.ArchivoData;
import scanner.data.Lexer;
import scanner.data.Token;

public class DatosArchivoController {
    
    //Referencia al archivo leído
    ArchivoData archivoData = new ArchivoData();
    
    public void setArchivo(JFileChooser archivoSeleccionado, String comando){
        if(comando.equals(JFileChooser.APPROVE_SELECTION)){
            File archivo = archivoSeleccionado.getSelectedFile();
            archivoData.setArchivo(archivo);
        }
    }
    
    public File getArchivoFromData(){
        return archivoData.getArchivo();
    }
    
    public String analizarArchivo() throws FileNotFoundException, IOException{
        File archivo = archivoData.getArchivo();
        
        Reader reader = new BufferedReader(new FileReader(archivo));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        while (true){
            Token token =lexer.yylex();
            if (token == null){
                resultado += "EOF";
                return resultado;
            }
            switch (token){
                case ERROR:
                    resultado += "Error lexico \n";
                    break;
                default:
                    resultado += "TOKEN: "+ token+ " " + lexer.lexeme.getValue() + " linea: " + lexer.lexeme.getLine() + "\n";
            }
        }
    }
}
