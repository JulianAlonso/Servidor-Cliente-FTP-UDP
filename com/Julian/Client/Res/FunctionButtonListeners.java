

package com.Julian.Client.Res;

import com.Julian.Client.Configuration.Config;
import com.Julian.Client.GUI.Components.DirectoryPanel;
import com.Julian.Client.Utils.Receive;
import com.Julian.Client.Utils.SendUtils;
import com.Julian.Entitys.ListMessage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author julialonso
 */
public class FunctionButtonListeners {
    
    /**
     * Sube a la carpeta superior a la actual.
     * @return Action Listener
     */
    public static ActionListener getUpListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DirectoryPanel.setElements(SendUtils.moveTo("/..").getModel());
            }
        };
    }
    
    /**
     * Delete current selected folder or file.
     * @return Action Listener
     */
    public static ActionListener getDeleteListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Borrar carpeta o archivo seleccionado.
            }
        };
    }
    
    /**
     * Create a new Folder.
     * @return 
     */
    public static ActionListener getCreateListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Crear una nueva carpeta.
            }
        };
    }
    
    /**
     * Upload an archive to actual folder.
     * @return 
     */
    public static ActionListener uploadListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Crear una nueva carpeta.
            }
        };
    }
    
    /**
     * Download the selected archive.
     * @return 
     */
    public static ActionListener downloadListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Crear una nueva carpeta.
            }
        };
    }
    
}
