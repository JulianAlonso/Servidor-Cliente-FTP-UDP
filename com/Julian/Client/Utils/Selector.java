

package com.Julian.Client.Utils;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author julialonso
 */
public class Selector {
    
    /**
     * Run a JFileChooser and return a selected file.
     * @return 
     */
    public static File getJFFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
            return chooser.getSelectedFile();
        else
            return null;
    }
    
    /**
     * Run a JFileChooser and return a selected directory.
     * @return 
     */
    public static File getJFDirectory() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
            return chooser.getSelectedFile();
        else
            return null;
    }
}
