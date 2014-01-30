/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Threads;

import com.Julian.Client.Configuration.Config;
import com.Julian.Entitys.Message;
import com.Julian.Server.Utils.MainThreadUtils;
import com.Julian.Utils.Receive;

/**
 *
 * @author admin
 */
public class MainThread extends Thread{
    
    
    
    public MainThread() {
        
    }
    
    @Override
    public void run() {
        while(true) {
            Object receive = Receive.receive(Config.PORT);
            if(receive instanceof Message) {
                MainThreadUtils.routeMessage((Message)receive);
            }
        }
    }
    
}
