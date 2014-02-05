package com.Julian.Server.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author julialonso
 */
public class CreateAndDeleteUtils {

    public static boolean createFile(File file, File actualDirectory) {
        InputStream in = null;
        try {
            File uploadedFile = new File(actualDirectory.getAbsolutePath()
                                         + "/" + file.getName());
            in = new FileInputStream(file);
            OutputStream out = new FileOutputStream(uploadedFile);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            
            return true;
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            return false;
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
            return false;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }
}
