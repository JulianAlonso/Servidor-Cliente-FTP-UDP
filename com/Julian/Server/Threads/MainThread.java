/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Server.Threads;
import com.Julian.Client.Utils.Receive;
import com.Julian.Entitys.Message;
import com.Julian.Server.Configuration.Config;
import com.Julian.Server.Utils.MainThreadUtils;


/**
 *
 * @author admin
 */
public class MainThread extends Thread {
    
    public MainThread() {
        System.out.println("Listening on port: "+Config.PORT_SERVER);
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
