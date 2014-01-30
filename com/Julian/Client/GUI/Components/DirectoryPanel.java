

package com.Julian.Client.GUI.Components;

import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author julialonso
 */
public class DirectoryPanel extends JPanel {
    
    private static JList dir;
    private JScrollPane dirPane;
    
    public DirectoryPanel() {
        generateComponents();
        addComponents();
    }
    
    public static void setElements(DefaultListModel elements) {
        DirectoryPanel.dir.setModel(elements);
    }
    
    private void generateComponents() {
        DirectoryPanel.dir = new JList();
        this.dirPane = new JScrollPane(dir);
        this.dirPane.setPreferredSize(new Dimension(400, 300));
    }
    
    private void addComponents() {
        this.add(dirPane);
    }
    
}
