/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Entitys;

import com.Julian.Res.Header;
import javax.swing.DefaultListModel;

/**
 *
 * @author admin
 */
public class ListMessage extends Message {
    
    private DefaultListModel listModel;
    
    public ListMessage(DefaultListModel listModel) {
        super(Header.LIST);
        this.listModel = listModel;
    }
     
    /**
     * Devuelve el listmodel del mensaje.
     * @return DefaultListModel.
     */
    public DefaultListModel getModel() {
        return this.listModel;
    }
    
}
