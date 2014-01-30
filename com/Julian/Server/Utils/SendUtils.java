/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Server.Configuration.Config;
import java.io.File;
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
            File comp = new File(Config.getDocumentRoot()+"/"+element);
            if(!comp.isHidden())
                dfl.addElement(element);
        }
        
        ListMessage lm = new ListMessage(dfl);
        
        Send.send(lm, message.getAddres(), message.getPort());
    }
}
