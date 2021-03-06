/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.FileMessage;
import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Res.Header;
import com.Julian.Server.Configuration.Config;
import java.io.File;

/**
 *
 * @author admin
 */
public class SendUtils {
    
    /**
     * Envia un mensaje con el defaultListModel del documentRoot
     * @param message Mensaje recibido del cliente.
     */
    public static void sendRootList(Message message) {
        String[] elements = Config.getDocumentRoot().list();
        ListMessage lm = new ListMessage(Gets.getLisModel(elements));
        
        Send.send(lm, message.getAddress(), message.getPort());
    }
    
    /**
     * Envia un mensaje con el defaultListModel del directorio en el que
     * se encuentra el cliente.
     * @param message - Mensaje recibido del cliente.
     * @param list String[], nombres de los archivos del directorio.
     */
    public static void sendCustomList(Message message, String[] list) {
        Send.send(new ListMessage(Gets.getLisModel(list)), 
                message.getAddress(), message.getPort());
    }
    
    /**
     * Envia un mensaje con el Archivo que le pide el cliente.
     * @param message - Mensaje recibido del cliente.
     * @param file Fichero pedido por el cliente.
     */
    public static void downloadFile(Message message, File file) {
        FileMessage send = new FileMessage(Header.DOWNLOAD, message.getAddress(), message.getPort(), file);
        Send.send(send, message.getAddress(), message.getPort());
    }
    
}
