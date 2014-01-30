

package com.Julian.Entitys;

import com.Julian.Res.Header;

/**
 *
 * @author julialonso
 */
public class DownMessage extends Message {
    
    private String element;
    
    public DownMessage(Header header, String element, String address, int port) {
        super(header, address, port);
    }
    
    public String getElement() {
        return this.element;
    }
}
