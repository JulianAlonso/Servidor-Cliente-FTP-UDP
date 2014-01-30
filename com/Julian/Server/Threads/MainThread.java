/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Threads;

import com.Julian.Client.Configuration.Config;
import com.Julian.Client.Utils.Receive;
import com.Julian.Entitys.Message;
import com.Julian.Server.Utils.MainThreadUtils;


/**
 *
 * @author admin
 */
public class MainThread extends Thread {
    
    public MainThread() {
        
    }
    
    @Override
    public void run() {
        while(true) {
            Object receive = Receive.receive(Config.PORT_SERVER);
            if(receive instanceof Message) {
                MainThreadUtils.routeMessage((Message)receive);
            }
        }
    }
    
}
