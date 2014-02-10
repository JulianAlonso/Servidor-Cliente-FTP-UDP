package com.Julian.Server.Utils;

import com.Julian.Server.Configuration.Config;
import java.io.File;
import javax.swing.DefaultListModel;

/**
 *
 * @author julialonso
 */
public class Gets {
    
    /**
     * Devuelve un nuevo deafultListModel segun el array de String que le pasen.
     * @param elements Sring[].
     * @return DefaultListModel
     */
    public static DefaultListModel getLisModel(String[] elements) {
        DefaultListModel dfl = new DefaultListModel();

        if (elements != null) {
            for (String element : elements) {
                File comp = new File(Config.getDocumentRoot() + "/" + element);
                if (!comp.isHidden()) {
                    dfl.addElement(element);
                }
            }
        }
        return dfl;
    }
}
