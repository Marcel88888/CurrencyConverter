package es.uv.eu.euroconversor.view;

import es.uv.eu.euroconversor.model.EuroConversorModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisplayPanel extends JPanel {
    
    private EuroConversorModel model;
    private JTextArea numbersDisplay;
    private JLabel rateDisplay;
    
    public DisplayPanel(EuroConversorModel model) {
        
        this.setLayout(new BoxLayout(this,  BoxLayout.Y_AXIS));
        this.setBackground(new Color(197,179,88));
        this.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.BLACK));
        
        this.model = model;
        
        this.numbersDisplay = new JTextArea();
        this.rateDisplay = new JLabel();
        
        numbersDisplay.setEditable(false);
        numbersDisplay.setBackground(new Color(197,179,88));
        numbersDisplay.setFont(new Font("Sans", Font.BOLD, 65));
        numbersDisplay.setForeground(Color.DARK_GRAY);
        numbersDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numbersDisplay.setText("0");
        
        rateDisplay.setAlignmentX(Component.LEFT_ALIGNMENT);
        rateDisplay.setText("Exchange rate: " + model.getExchangeRate());
        rateDisplay.setForeground(Color.BLACK);
        
        this.add(numbersDisplay);
        this.add(rateDisplay);
    }

    public JTextArea getNumbersDisplay() {
        return numbersDisplay;
    }

    public JLabel getRateDisplay() {
        return rateDisplay;
    }
    
    
}
