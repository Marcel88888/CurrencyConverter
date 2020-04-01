package es.uv.eu.euroconverter.view;

import es.uv.eu.euroconverter.model.EuroConverterModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class DisplayPanel extends JPanel {
    
    private EuroConverterModel model;
    private JLabel numbersDisplay;
    private JLabel rateDisplay;
    
    public DisplayPanel(EuroConverterModel model) {
        
        this.setLayout(new BoxLayout(this,  BoxLayout.Y_AXIS));
        this.setBackground(new Color(197,179,88));
        this.setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, Color.BLACK));
        
        this.model = model;
        
        this.numbersDisplay = new JLabel(model.getNumber(), SwingConstants.RIGHT);
        this.rateDisplay = new JLabel("Exchange rate: " + model.getExchangeRate(), SwingConstants.LEFT);
        
        numbersDisplay.setFont(new Font("Sans", Font.BOLD, 65));
        numbersDisplay.setForeground(Color.DARK_GRAY);
        numbersDisplay.setPreferredSize(new Dimension(450, 75));
        numbersDisplay.setMinimumSize(numbersDisplay.getPreferredSize());
        numbersDisplay.setMaximumSize(numbersDisplay.getPreferredSize());
        
        rateDisplay.setForeground(Color.BLACK);
        
        this.add(numbersDisplay);
        this.add(rateDisplay);
    }

    public JLabel getNumbersDisplay() {
        return numbersDisplay;
    }

    public JLabel getRateDisplay() {
        return rateDisplay;
    }
    
    
}
