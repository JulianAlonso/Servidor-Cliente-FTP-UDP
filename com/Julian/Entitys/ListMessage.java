/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Julian.Entitys;

import com.Julian.Res.Header;
import java.io.Serializable;
import javax.swing.DefaultListModel;

/**
 *
 * @author admin
 */
public class ListMessage extends Message implements Serializable {
    
    private DefaultListModel listModel;
    
    public ListMessage(DefaultListModel listModel) {
        super(Header.LIST);
        this.listModel = listModel;
    }
     
    public DefaultListModel getModel() {
        return this.listModel;
    }
    
}
