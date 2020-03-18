/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uv.eu.euroconversor.view;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EuroConversorMenu extends JMenuBar {
    
    private JMenu calculator;
    private JMenuItem exit;
    private JMenuItem changeRate;
    
    public EuroConversorMenu() {
        
        this.calculator = new JMenu("Calculator");
        
        this.exit = new JMenuItem("Exit");
        exit.setActionCommand("exit");
        
        this.changeRate = new JMenuItem("Change rate");
        changeRate.setActionCommand("changeRate");
        
        calculator.add(exit);
        calculator.add(changeRate);
        
        this.add(calculator);
    }
    
    public void setActionListener(ActionListener al) {
        exit.addActionListener(al);
        changeRate.addActionListener(al);
    }
    
}
