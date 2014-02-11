

package com.Julian.Client;

import com.Julian.Client.GUI.Components.DirectoryPanel;
import com.Julian.Client.GUI.GUIClient;
import com.Julian.Client.Utils.SendUtils;

/**
 * Programa principal del cliente, este lanzara todo lo demas.
 * @author julialonso
 */
public class Client {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        //Testing the Client's gui
        GUIClient g = new GUIClient();
        onStart();
    }
    
    private static void onStart() {
        DirectoryPanel.setElements(SendUtils.connect().getModel());
    }
}
