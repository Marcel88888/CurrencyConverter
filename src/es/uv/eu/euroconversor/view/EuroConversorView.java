package es.uv.eu.euroconversor.view;

import es.uv.eu.euroconversor.model.EuroConversorModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EuroConversorView extends JFrame {
    
    private EuroConversorModel model;
    private EuroConversorMenu menu;
    private DisplayPanel displayPanel;
    private NumberPanel numberPanel;
    private OperationPanel operationPanel;
    private ClearPanel clearPanel;
    
    public EuroConversorView(EuroConversorModel model) {
        super("EuroConversor");
        this.setLayout(new BorderLayout(17, 8));
        this.setSize(450, 400);
        
        this.model = model;
        this.menu = new EuroConversorMenu();
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

    public EuroConversorModel getModel() {
        return model;
    }

    public EuroConversorMenu getMenu() {
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
    
    
    
    public void setActionListener(ActionListener al) {
        menu.setActionListener(al);
        //displayPanel.setActionListener(al);
        numberPanel.setActionListener(al);
        //operationPanel.setActionListener(al);
        //clearPanel.setActionListener(al);
    }
}


    
    

