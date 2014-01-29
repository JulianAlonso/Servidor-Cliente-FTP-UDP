

package com.Julian.Client.GUI.Components;

import java.awt.Dimension;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author julialonso
 */
public class DirectoryPanel extends JPanel {
    
    private JList dir;
    private JScrollPane dirPane;
    
    public DirectoryPanel() {
        generateComponents();
        addComponents();
    }
    
    private void generateComponents() {
        this.dir = new JList();
        this.dirPane = new JScrollPane(dir);
        this.dirPane.setPreferredSize(new Dimension(400, 300));
    }
    
    private void addComponents() {
        this.add(dirPane);
    }
    
}
