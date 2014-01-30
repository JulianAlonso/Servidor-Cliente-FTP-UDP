/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Client.Utils;

import com.Julian.Client.Configuration.Config;
import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Res.Header;
import com.Julian.Utils.Receive;
import com.Julian.Utils.Send;

/**
 *
 * @author admin
 */
public class Methods {
    
    public static ListMessage connect() {
        Message connect = new Message(Header.CONECT, Config.SERVER_ADDRES, Config.PORT);
        Send.send(connect, Config.SERVER_ADDRES, Config.PORT);
        ListMessage lm = (ListMessage)Receive.receive(Config.PORT);
        return lm;
    }
}
