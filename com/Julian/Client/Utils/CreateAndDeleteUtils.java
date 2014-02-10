

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
