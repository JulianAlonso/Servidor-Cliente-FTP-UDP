/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.MoveMessage;
import com.Julian.Entitys.Message;
import com.Julian.Server.Entitys.Client;
import com.Julian.Server.Res.Clients;

/**
 *
 * @author admin
 */
public class MainThreadUtils {
    
    public static void routeMessage(Message message) {
        switch(message.getHeader()) {
            case CONECT: 
                SendUtils.sendRootList(message);
                Clients.addClient(new Client(message.getAddress(), message.getPort()));
                break;
            case UPLOAD:
                break;
            case DOWNLOAD:
                break;
            case MOVE:
                Clients.getClient(
                        message.getAddress()).moveAndSend(
                        ((MoveMessage)message));
                break;
            case LIST:
                break;
        }
    }
    
    
    
}
