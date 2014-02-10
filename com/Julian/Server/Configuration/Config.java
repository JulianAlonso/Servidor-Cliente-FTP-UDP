/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Configuration;

import java.io.File;

/**
 *
 * @author admin
 */
public class Config {
    public static int PORT_SERVER = 9998;
    private static File documentRoot;
    
    /**
     * Set de document root.
     * @param documentRoot FILE.
     */
    public static void setDocumentRoot(File documentRoot) {
        Config.documentRoot = documentRoot;
    }
    
    /**
     * Returns the document root.
     * @return File
     */
    public static File getDocumentRoot() {
        return Config.documentRoot;
    }
}
