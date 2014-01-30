

package com.Julian.Client.Res;

import com.Julian.Client.Utils.SendUtils;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JList;

/**
 *
 * @author julialonso
 */
public class DirectoryPanelListeners {
    
    public static MouseListener getDoubleClickListener() {
        return new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                JList list = (JList) evt.getSource();
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint());
                    list.setModel(
                            SendUtils.downTo(
                            (String)list.getModel().getElementAt(index)).getModel());
                } 
            }
        };
    }
    
}
