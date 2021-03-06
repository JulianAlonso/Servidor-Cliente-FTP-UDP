/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.ElementMessage;
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
    
    /**
     * Hace lo debido segun el tipo de header que venga en el mensaje.
     * @param message Mensaje recibido.
     */
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
                Clients.getClient(
                        message.getAddress()).sendFile(
                        (ElementMessage)message);
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
            case CREATE:
                Clients.getClient(
                        message.getAddress()).createFolder(
                        (ElementMessage)message);
                break;
            case DELETE:
                Clients.getClient(message.getAddress()).deleteFolder(
                        (ElementMessage)message);
                break;
            case LIST:
                break;
        }
    }
    
    
    
}
