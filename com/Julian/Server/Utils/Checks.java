

package com.Julian.Server.Utils;

import java.io.File;

/**
 *
 * @author julialonso
 */
public class Checks {
    
    public static boolean isDirectory(String name, File actualDirectory) {
        File test = new File(actualDirectory.getPath()+"/"+name);
        return test.isDirectory();
    }
}
