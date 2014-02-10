

package com.Julian.Client.Res;

import com.Julian.Client.GUI.Components.DirectoryPanel;
import com.Julian.Client.Utils.SendUtils;
import com.Julian.Client.Utils.Selector;
import com.Julian.Server.Utils.CreateAndDeleteUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
                DirectoryPanel.setElements(SendUtils.moveUp().getModel());
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
                File upload = Selector.getJFFile();
                if(upload != null)
                    DirectoryPanel.setElements(
                            SendUtils.uploadFile(upload).getModel());
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
                File destinationDirectory = Selector.getJFDirectory();
                if(destinationDirectory != null)
                    CreateAndDeleteUtils.createFile(SendUtils.downloadFile(
                            DirectoryPanel.getSelectedItem()), destinationDirectory);
                
            }
        };
    }
    
}
