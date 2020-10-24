package es.uv.eu.currencyconverter.view;

import es.uv.eu.currencyconverter.model.CurrencyConverterModel;
import es.uv.eu.currencyconverter.model.CurrencyConverterModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class CurrencyConverterView extends JFrame {
    
    private CurrencyConverterModel model;
    private CurrencyConverterMenu menu;
    private DisplayPanel displayPanel;
    private NumberPanel numberPanel;
    private OperationPanel operationPanel;
    private ClearPanel clearPanel;
    
    public CurrencyConverterView(CurrencyConverterModel model) {
        super("CurrencyConverter");
        this.setLayout(new BorderLayout(17, 8));
        this.setSize(450, 400);
        
        this.model = model;
        this.menu = new CurrencyConverterMenu();
        this.displayPanel = new DisplayPanel(model);
        this.numberPanel = new NumberPanel();
        this.operationPanel = new OperationPanel();
        this.clearPanel = new ClearPanel();
        
        this.setJMenuBar(menu);
        this.add(displayPanel, BorderLayout.NORTH);
        this.add(numberPanel, BorderLayout.CENTER);
        this.add(operationPanel, BorderLayout.EAST);
        this.add(clearPanel, BorderLayout.SOUTH);
        
        
        getRootPane().setBorder(BorderFactory.createMatteBorder(8, 8, 8, 8, this.getBackground()));
        this.setVisible(true);
    }

    public CurrencyConverterModel getModel() {
        return model;
    }

    public CurrencyConverterMenu getMenu() {
        return menu;
    }

    public DisplayPanel getDisplayPanel() {
        return displayPanel;
    }

    public NumberPanel getNumberPanel() {
        return numberPanel;
    }

    public OperationPanel getOperationPanel() {
        return operationPanel;
    }

    public ClearPanel getClearPanel() {
        return clearPanel;
    }

    public void setModel(CurrencyConverterModel model) {
        this.model = model;
    }
    
    public void setActionListener(ActionListener al) {
        menu.setActionListener(al);
        numberPanel.setActionListener(al);
        operationPanel.setActionListener(al);
        clearPanel.setActionListener(al);
    }
}


    
    

