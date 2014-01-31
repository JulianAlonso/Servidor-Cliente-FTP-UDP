

package com.Julian.Server.Entitys;

import com.Julian.Entitys.MoveMessage;
import com.Julian.Server.Configuration.Config;
import com.Julian.Server.Utils.Gets;
import com.Julian.Server.Utils.Send;
import com.Julian.Server.Utils.SendUtils;
import java.io.File;

/**
 *
 * @author julialonso
 */
public class Client {
    
    private String address;
    private int port;
    private File actualDirectory;
    
    public Client(String address, int port) {
        this.address = address;
        this.port = port;
        this.actualDirectory = Config.getDocumentRoot();
    }
    
    public void setActualDirectory(File directory) {
        this.actualDirectory = directory;
    } 
    
    public String getAddress() {
        return this.address;
    }
    
    public int getPort() {
        return this.port;
    }
    
    public File getActualDirectory() {
        return this.actualDirectory;
    }
    
    public void moveAndSend(MoveMessage message) {
        setActualDirectory(new File(getActualDirectory()+"/"+message.getElement()));
        SendUtils.sendCustomList(message, getActualDirectory().list());
    }
    
}
