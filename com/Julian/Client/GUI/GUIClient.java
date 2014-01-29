

package com.Julian.Client.GUI;

import com.Julian.Client.GUI.Components.DirectoryPanel;
import com.Julian.Client.GUI.Components.FunctionButton;
import com.Julian.Client.Res.FunctionButtonListeners;
import com.Julian.Res.Images;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;

/**
 *
 * @author julialonso
 */
public class GUIClient extends JFrame {
    
    private DirectoryPanel directoryPanel;
    private FunctionButton upButton;
    private FunctionButton deleteButton;
    private FunctionButton createButton;
    private FunctionButton uploadButton;
    private FunctionButton downloadButton;
    
    public GUIClient() {
        super();
        this.setLayout(new GridBagLayout());
        this.generateComponents();
        
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10,10,10,10);
        
        //Buttons
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipadx = 30;
        c.fill = GridBagConstraints.WEST;
        this.add(upButton, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipadx = 60;
        c.fill = GridBagConstraints.EAST;
        this.add(createButton, c);
        
        c.gridx = 2;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipadx = 0;
        c.fill = GridBagConstraints.EAST;
        this.add(deleteButton, c);
        
        c.gridx = 7;
        c.gridy = 6;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipadx = 0;
        c.fill = GridBagConstraints.EAST;
        this.add(uploadButton, c);
        
        c.gridx = 7;
        c.gridy = 7;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.ipadx = 0;
        c.fill = GridBagConstraints.EAST;
        this.add(downloadButton, c);
        
        
        //List
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 6;
        c.gridheight = 9;
        c.fill = GridBagConstraints.CENTER;
        this.add(directoryPanel, c);
        
        
        this.validate();
        this.pack();
        this.setVisible(true);
    }
    
    private void generateComponents() {
        this.directoryPanel = new DirectoryPanel();
        this.upButton = new FunctionButton(Images.UP_FOLDER, FunctionButtonListeners.getUpListener());
        this.deleteButton = new FunctionButton(Images.DELETE_FOLDER, FunctionButtonListeners.getDeleteListener());
        this.createButton = new FunctionButton(Images.NEW_FOLDER, FunctionButtonListeners.getCreateListener());
        this.uploadButton = new FunctionButton("Upload Archive", FunctionButtonListeners.uploadListener());
        this.downloadButton = new FunctionButton("Download Archive", FunctionButtonListeners.downloadListener());
        
    }
    
}
