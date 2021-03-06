package com.Julian.Server.Utils;

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

    public static boolean createFile(FileMessage fm, File actualDirectory) {
        File uploadedFile = new File(actualDirectory.getAbsolutePath()
                + "/" + fm.getName());

        try (FileOutputStream fos = new FileOutputStream(uploadedFile)) {
            fos.write(fm.getData());
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    /**
     * RECURSIVO.
     * Borra todos los ficheros dentro de una carpeta y la carpta en si misma.
     * Se llamara a si mismo si encuentra una carpeta dentro.
     * @param directory - Directorio o fichero a borrar.
     */
    public static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        } 
        directory.delete();
    }
}
