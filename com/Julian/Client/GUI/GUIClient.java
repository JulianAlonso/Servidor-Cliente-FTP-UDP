

package com.Julian.Client.GUI;

import com.Julian.Client.GUI.Components.DirectoryPanel;
import java.awt.GridBagLayout;
import javax.swing.JFrame;

/**
 *
 * @author julialonso
 */
public class GUIClient extends JFrame {
    
    private DirectoryPanel directoryPanel;
    
    public GUIClient() {
        super();
        //this.setLayout(new GridBagLayout());
        this.generateComponents();
        this.add(this.directoryPanel);
        
        this.validate();
        this.pack();
        this.setVisible(true);
    }
    
    private void generateComponents() {
        this.directoryPanel = new DirectoryPanel();
    }
}
