

package com.Julian.Client.Res;

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
                //Subir Carpeta Actual.
            }
        };
    }
    
    /**
     * Delete current selected folder.
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
     * Create a new Folder.
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
     * Create a new Folder.
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
