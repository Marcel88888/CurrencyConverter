package es.uv.eu.euroconverter.view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class EuroConverterMenu extends JMenuBar {
    
    private JMenu calculator;
    private JMenuItem exit;
    private JMenuItem changeRate;
    
    public EuroConverterMenu() {
        
        this.calculator = new JMenu("Calculator");
        
        this.exit = new JMenuItem("Exit");
        exit.setActionCommand("exit");
        
        this.changeRate = new JMenuItem("Change rate");
        changeRate.setActionCommand("changeRate");
        
        calculator.add(changeRate);
        calculator.add(exit);
        
        this.add(calculator);
    }
    
    public void setActionListener(ActionListener al) {
        exit.addActionListener(al);
        changeRate.addActionListener(al);
    }
    
}
