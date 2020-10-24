package es.uv.eu.currencyconverter.view;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CurrencyConverterMenu extends JMenuBar {
    
    private JMenu calculator;
    private JMenuItem exit;
    private JMenuItem changeRate;
    
    public CurrencyConverterMenu() {
        
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
