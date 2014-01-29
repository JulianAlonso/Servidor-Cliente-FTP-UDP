/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Julian.Client.GUI.Components;

import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;



/**
 *
 * @author Álvaro
 */
public class FunctionButton extends JButton{
    
    public FunctionButton(String textButton, ActionListener listener){
        super(textButton);
        this.addActionListener(listener);
    }
    
    public FunctionButton(Image imgButton,ActionListener listener){
        super(new ImageIcon(imgButton));
        this.setBorder(BorderFactory.createEmptyBorder());
        this.addActionListener(listener);
    }
}
