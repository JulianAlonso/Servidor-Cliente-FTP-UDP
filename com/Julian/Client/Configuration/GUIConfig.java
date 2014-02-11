

package com.Julian.Client.Configuration;

/**
 * Configuracion del cliente.
 * @author julialonso
 */
public class GUIConfig {
    
    private static String DOCUMENT_ROOT;
    private static String ACTUAL_DIR;
    
    public static void setDocumentRoot(String pathDocumentRoot) {
        GUIConfig.DOCUMENT_ROOT = pathDocumentRoot;
    }
    
    public static String getDocumentRoot() {
        return GUIConfig.DOCUMENT_ROOT;
    }
    
    public static void setActualDir(String pathActualDir) {
        GUIConfig.ACTUAL_DIR = pathActualDir;
    }
    
    public static String getActualDir() {
        return GUIConfig.ACTUAL_DIR;
    }
}
