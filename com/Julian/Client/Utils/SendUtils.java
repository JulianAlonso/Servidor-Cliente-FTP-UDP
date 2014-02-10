package com.Julian.Client.Utils;

import com.Julian.Client.Configuration.Config;
import com.Julian.Entitys.ElementMessage;
import com.Julian.Entitys.FileMessage;
import com.Julian.Entitys.MoveMessage;
import com.Julian.Entitys.ListMessage;
import com.Julian.Entitys.Message;
import com.Julian.Res.Header;
import java.io.File;

/**
 *
 * @author admin
 */
public class SendUtils {
    
    /**
     * Envia el mensaje de conexion inicial y recibe el listMessaje 
     * con el listmodel del document
     * root
     * @return ListMessage
     */
    public static ListMessage connect() {
        Message connect = new Message(Header.CONECT, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(connect, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage)Receive.receive(Config.PORT_CLIENT);
    }
    
    /**
     * 
     * @param element
     * @return 
     */
    public static ListMessage moveDownTo(String element) {
        MoveMessage down = new MoveMessage(Header.MOVEDOWN, element, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(down, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage)Receive.receive(Config.PORT_CLIENT);
    }
    
    public static ListMessage moveUp() {
        Message up = new Message(Header.MOVEUP, Config.CLIENT_ADDRESS, Config.PORT_CLIENT);
        Send.send(up, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage)Receive.receive(Config.PORT_CLIENT);
    }
    
    public static ListMessage uploadFile(File file) {
        FileMessage upload = new FileMessage(Header.UPLOAD, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, file);
        Send.send(upload, Config.SERVER_ADDRESS, Config.PORT_SERVER);
        return (ListMessage)Receive.receive(Config.PORT_CLIENT);
    }
    
   public static FileMessage downloadFile(String element) {
       ElementMessage download = new ElementMessage(Header.DOWNLOAD, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, element);
       Send.send(download, Config.SERVER_ADDRESS, Config.PORT_SERVER);
       return (FileMessage)Receive.receive(Config.PORT_CLIENT);
   }
   
   public static ListMessage deleteFile(String element) {
       ElementMessage delete = new ElementMessage(Header.DELETE, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, element);
       Send.send(delete, Config.SERVER_ADDRESS, Config.PORT_SERVER);
       return (ListMessage)Receive.receive(Config.PORT_CLIENT);
   }
   
   public static ListMessage createDirectory(String element) {
       ElementMessage create = new ElementMessage(Header.CREATE, Config.CLIENT_ADDRESS, Config.PORT_CLIENT, element);
       Send.send(create, Config.SERVER_ADDRESS, Config.PORT_SERVER);
       return (ListMessage)Receive.receive(Config.PORT_CLIENT);
   }
}
