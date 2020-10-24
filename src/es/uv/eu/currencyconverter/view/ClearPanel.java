package es.uv.eu.currencyconverter.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

class ClearPanel extends JPanel {
    
    private JButton clear;
    
    public ClearPanel() {
       
        this.setLayout(new BorderLayout());
        
        this.clear = new JButton("CLEAR");
        clear.setPreferredSize(new Dimension(0, 40));
        clear.setFont(new Font("Sans", Font.BOLD, 17));
        clear.setActionCommand("clear");
        this.add(clear);
    }
    
    public void setActionListener(ActionListener al) {
        clear.addActionListener(al);
    }
}
