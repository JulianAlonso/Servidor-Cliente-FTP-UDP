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
    private static File documentRoot;
    
    public static void setDocumentRoot(File documentRoot) {
        Config.documentRoot = documentRoot;
    }
    
    public static File getDocumentRoot() {
        return Config.documentRoot;
    }
}
