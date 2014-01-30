

package com.Julian.Server.Entitys;

import com.Julian.Server.Configuration.Config;
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
    
    public String getAddress() {
        return this.address;
    }
    
    public int getPort() {
        return this.port;
    }
    
    public File getActualDirectory() {
        return this.actualDirectory;
    }
    
}
