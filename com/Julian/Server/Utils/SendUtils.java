/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Server.Configuration.Config;

/**
 *
 * @author admin
 */
public class SendUtils {

    public static void sendRootList(Message message) {
        String[] elements = Config.getDocumentRoot().list();
        ListMessage lm = new ListMessage(Gets.getLisModel(elements));
        
        Send.send(lm, message.getAddress(), message.getPort());
    }
    
}
