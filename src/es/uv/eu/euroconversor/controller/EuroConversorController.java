package es.uv.eu.euroconversor.controller;


import es.uv.eu.euroconversor.model.EuroConversorModel;
import es.uv.eu.euroconversor.view.EuroConversorView;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class EuroConversorController {
    
    private EuroConversorModel model;
    private EuroConversorView view;
    
    public EuroConversorController(EuroConversorModel model, EuroConversorView view) {
        this.model = model;
        this.view = view;
        view.setActionListener(new EuroConversorControllerActionListener());
    }
    
    class EuroConversorControllerActionListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            if (command.matches("[0-9]") || command.matches(".") || command.matches("C")) {
                view.getDisplayPanel().getNumbersDisplay().setText(model.addDigit(command));
            }
            else {
                float newExchangeRate;
                switch(command) {
                case "exit":
                    System.exit(0);
                    break;
                case "changeRate":
                    try {
                        newExchangeRate = Float.parseFloat(JOptionPane.showInputDialog(null, 
                                "New exchange rate"));
                    } catch (NumberFormatException e) {newExchangeRate = Float.parseFloat(model.getExchangeRate());}
                    model.setExchangeRate(newExchangeRate);
                    view.getDisplayPanel().getRateDisplay().setText("Exchange rate: " + model.getExchangeRate());
                    break;
                default:
                    System.out.println("Controller: Command " + command + 
                            " no recognised.");
                    break;
                }
            }
        }
    }
    
}