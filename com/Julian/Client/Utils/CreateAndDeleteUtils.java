

package com.Julian.Client.Utils;

import com.Julian.Entitys.FileMessage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author julialonso
 */
public class CreateAndDeleteUtils {
    
    /**
     * Crea el fichero que esta en el FileMessage en el "destinationDirectory"
     * @param fm - FileMessage - contiene el nombre y los datos del fichero.
     * @param destinationDirectory - File - Directorio en el que crearemos el 
     * archivo.
     * @return Booelan - true si ha creado el archivo.
     */
    public static boolean createFile(FileMessage fm, File destinationDirectory) {
        File downloadedFile = new File(destinationDirectory.getAbsolutePath()
                + "/" + fm.getName());
        
        try (FileOutputStream fos = new FileOutputStream(downloadedFile)) {
            fos.write(fm.getData());
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        } 
    }
    
}
