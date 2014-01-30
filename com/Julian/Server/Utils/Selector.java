/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author admin
 */
public class Selector {
    
    /**
     * Run a JFileChooser and return a selected file.
     * @return 
     */
    public static File getJFFile() {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION)
            return chooser.getSelectedFile();
        else
            return null;
    }
    
}
