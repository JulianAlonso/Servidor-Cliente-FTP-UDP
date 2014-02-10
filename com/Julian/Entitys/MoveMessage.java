

package com.Julian.Entitys;

import com.Julian.Res.Header;

/**
 *
 * @author julialonso
 */
public class MoveMessage extends Message {
    
    private String element;
    
    public MoveMessage(Header header, String element, String address, int port) {
        super(header, address, port);
        this.element = element;
    }
    
    /**
     * Devuelve el elemento.
     * @return String
     */
    public String getElement() {
        return this.element;
    }
}
