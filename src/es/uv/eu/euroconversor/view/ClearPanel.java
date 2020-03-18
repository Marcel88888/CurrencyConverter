

package es.uv.eu.euroconversor.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

class ClearPanel extends JPanel {
    
    private JButton clear;
    
    public ClearPanel() {
       
        this.setLayout(new BorderLayout());
        
        this.clear = new JButton("CLEAR");
        clear.setPreferredSize(new Dimension(0, 40));
        clear.setFont(new Font("Sans", Font.BOLD, 17));
        this.add(clear);
    }
}
