/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Client.Utils;

import com.Julian.Client.Configuration.Config;
import com.Julian.Entitys.MoveMessage;
import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Res.Header;

/**
 *
 * @author admin
 */
public class SendUtils {
    
    public static ListMessage connect() {
        Message connect = new Message(Header.CONECT, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(connect, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage)Receive.receive(Config.PORT_CLIENT);
    }
    
    public static ListMessage moveTo(String element) {
        MoveMessage down = new MoveMessage(Header.MOVE, element, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(down, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage)Receive.receive(Config.PORT_CLIENT);
    }
}
