

package com.Julian.Server.Entitys;

import com.Julian.Entitys.Message;
import com.Julian.Entitys.MoveMessage;
import com.Julian.Server.Configuration.Config;
import com.Julian.Server.Utils.Checks;
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
    
    public void moveDownAndSend(MoveMessage message) {
        if(Checks.isDirectory(message.getElement(), getActualDirectory()))
            setActualDirectory(new File(getActualDirectory()+"/"+message.getElement()));
        System.out.println("Estoy en: "+getActualDirectory());
        SendUtils.sendCustomList(message, getActualDirectory().list());
    }
    
    public void moveUpAndSend(Message message) {
        if(!actualDirectory.getPath().equals(Config.getDocumentRoot().getPath()))
            setActualDirectory(new File(getActualDirectory().getParent()));
        System.out.println("Estoy en: "+getActualDirectory());
        SendUtils.sendCustomList(message, getActualDirectory().list());
    }
}
