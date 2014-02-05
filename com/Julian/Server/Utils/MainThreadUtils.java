/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.FileMessage;
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
                Clients.getClient(
                        message.getAddress()).createFile(
                        (FileMessage)message);
                break;
            case DOWNLOAD:
                break;
            case MOVEDOWN:
                Clients.getClient(
                        message.getAddress()).moveDownAndSend(
                        ((MoveMessage)message));
                break;
            case MOVEUP:
                Clients.getClient(
                        message.getAddress()).moveUpAndSend(
                        (Message)message);
                break;
            case LIST:
                break;
        }
    }
    
    
    
}
