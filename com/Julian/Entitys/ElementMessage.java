

package com.Julian.Entitys;

import com.Julian.Res.Header;

/**
 *
 * @author julialonso
 */
public class ElementMessage extends Message {
    
    private String elementName;
    
    public ElementMessage(Header header, String address, int port, String elementName) {
        super(header, address, port);
        this.elementName = elementName;
    }
    
    public String getElementName() {
        return this.elementName;
    }
}
