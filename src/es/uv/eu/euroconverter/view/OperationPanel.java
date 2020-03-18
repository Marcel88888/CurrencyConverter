package es.uv.eu.euroconverter.view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class OperationPanel extends JPanel {
    
    private JRadioButton euroDollar;
    private JRadioButton dollarEuro;
    private ButtonGroup currencyGroup;
    private JButton convert;
    
    public OperationPanel() {
        
        this.setLayout(new GridLayout(5,1));
        
        this.euroDollar = new JRadioButton("€ - $");
        this.dollarEuro = new JRadioButton("$ - €");
        this.currencyGroup = new ButtonGroup();
        this.convert = new JButton("Convert");
        
        euroDollar.setBorderPainted(true);
        euroDollar.setPreferredSize(new Dimension(150, 5));
        euroDollar.setFont(new Font("Sans", Font.BOLD, 15));
        euroDollar.setSelected(true);
        euroDollar.setActionCommand("euroDollar");
        
        dollarEuro.setBorderPainted(true);
        dollarEuro.setFont(new Font("Sans", Font.BOLD, 15));
        dollarEuro.setActionCommand("dollarEuro");
        
        currencyGroup.add(euroDollar);
        currencyGroup.add(dollarEuro);
        
        convert.setFont(new Font("Sans", Font.BOLD, 15));
        convert.setActionCommand("convert");
        
        this.add(euroDollar);
        this.add(dollarEuro);
        this.add(convert);
    }
    
    public void setActionListener(ActionListener al) {
        euroDollar.addActionListener(al);
        dollarEuro.addActionListener(al);
        convert.addActionListener(al);
    }

    public JRadioButton getEuroDollar() {
        return euroDollar;
    }

    public JRadioButton getDollarEuro() {
        return dollarEuro;
    }
}
