package es.uv.eu.euroconverter.view;

import es.uv.eu.euroconverter.model.EuroConverterModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class EuroConverterView extends JFrame {
    
    private EuroConverterModel model;
    private EuroConverterMenu menu;
    private DisplayPanel displayPanel;
    private NumberPanel numberPanel;
    private OperationPanel operationPanel;
    private ClearPanel clearPanel;
    
    public EuroConverterView(EuroConverterModel model) {
        super("EuroConverter");
        this.setLayout(new BorderLayout(17, 8));
        this.setSize(450, 400);
        
        this.model = model;
        this.menu = new EuroConverterMenu();
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

    public EuroConverterModel getModel() {
        return model;
    }

    public EuroConverterMenu getMenu() {
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

    public void setModel(EuroConverterModel model) {
        this.model = model;
    }
    
    public void setActionListener(ActionListener al) {
        menu.setActionListener(al);
        numberPanel.setActionListener(al);
        operationPanel.setActionListener(al);
        clearPanel.setActionListener(al);
    }
}


    
    

