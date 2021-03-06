package es.uv.eu.currencyconverter.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NumberPanel extends JPanel {
    
    private JButton[] numberButtons;
    private static final String[] buttonsNames = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "C"};
    
    public NumberPanel() {
        
        this.setLayout(new GridLayout(3,4,5,5));
        
        this.numberButtons = new JButton[12];
        for (int i=0; i<buttonsNames.length; i++) {
            numberButtons[i] = new JButton(buttonsNames[i]);
            numberButtons[i].setFont(new Font("Sans", Font.BOLD, 20));
            this.add(numberButtons[i]);
        }
    }
    
    public void setActionListener(ActionListener al) {
        for (int i=0; i<numberButtons.length; i++) {
            numberButtons[i].addActionListener(al);
            numberButtons[i].setActionCommand(buttonsNames[i]);
        }
    }

    public static String getButtonName(int i) {
        return buttonsNames[i];
    }
    
    public int getButtonsNamesLength() {
        return buttonsNames.length;
    }
    
    
}
