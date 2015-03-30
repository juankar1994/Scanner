
package scanner.controller;

import java.io.File;
import javax.swing.JFileChooser;
import scanner.data.ArchivoData;

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
    
    public void analizarArchivo(){
        File archivo = archivoData.getArchivo();
    }
}
