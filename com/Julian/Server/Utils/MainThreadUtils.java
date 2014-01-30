/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Utils;

import com.Julian.Entitys.Message;

/**
 *
 * @author admin
 */
public class MainThreadUtils {
    
    public static void routeMessage(Message message) {
        switch(message.getHeader()) {
            case CONECT: 
                SendUtils.sendRootList(message);
                break;
            case UPLOAD:
                break;
            case DOWNLOAD:
                break;
            case MOVEDOWN:
                break;
            case MOVEUP:
                break;
            case LIST:
                break;
        }
    }
    
    
    
}
