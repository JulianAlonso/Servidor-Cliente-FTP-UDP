

package com.Julian.Client;

import com.Julian.Client.GUI.Components.DirectoryPanel;
import com.Julian.Client.GUI.GUIClient;
import com.Julian.Client.Utils.Methods;

/**
 *
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
        DirectoryPanel.setElements(Methods.connect().getModel());
    }
}
