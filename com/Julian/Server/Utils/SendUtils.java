/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Server.Configuration.Config;
import com.Julian.Utils.Send;
import javax.swing.DefaultListModel;

/**
 *
 * @author admin
 */
public class SendUtils {

    public static void sendRootList(Message message) {
        DefaultListModel dfl = new DefaultListModel();
        String[] elements = Config.getDocumentRoot().list();

        for (String element : elements) {
            dfl.addElement(element);
        }
        
        Send.send(new ListMessage(dfl, message.getAddres().toString(), message.getPort()),
                message.getAddres().toString(), message.getPort());
    }
}
