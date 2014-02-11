package com.Julian.Client.GUI.Components;

import com.Julian.Client.Res.DirectoryPanelListeners;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Panel de navegacion.
 * @author julialonso
 */
public class DirectoryPanel extends JPanel {
    
    private static JList dir;
    private JScrollPane dirPane;
    
    public DirectoryPanel() {
        generateComponents();
        addComponents();
        addListeners();
    }
    
    public static void setElements(DefaultListModel elements) {
        DirectoryPanel.dir.setModel(elements);
    }
    
    public static String getSelectedItem() {
        return DirectoryPanel.dir.getSelectedValue().toString();
    }
    
    private void generateComponents() {
        DirectoryPanel.dir = new JList();
        this.dirPane = new JScrollPane(dir);
        this.dirPane.setPreferredSize(new Dimension(400, 300));
    }
    
    private void addComponents() {
        this.add(dirPane);
    }
    
    private void addListeners() {
        dir.addMouseListener(DirectoryPanelListeners.getDoubleClickListener());
    }
}
