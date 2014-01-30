/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Entitys;

import com.Julian.Res.Header;
import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Message implements Serializable {
    
    private Header header;
    private String address;
    private int port;
    
    public Message(Header header) {
        this.header = header;
    }
    
    public Message(Header header, String address, int port) {
        this.header = header;
        this.address = address;
        this.port = port;
    }
    
    /**
     * return the message's port.
     * @return int - port.
     */
    public int getPort() {
        return this.port;
    }
    
    /**
     * Return the message's header;
     * @return Header
     */
    public Header getHeader() {
        return this.header;
    }
    
    /**
     * Return the client's address.
     * @return InetAddress - The client's address.
     */
    public String getAddress() {
        return this.address;
    }
    
}
