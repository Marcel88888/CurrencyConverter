package es.uv.eu.euroconverter.controller;


import es.uv.eu.euroconverter.model.EuroConverterModel;
import es.uv.eu.euroconverter.view.EuroConverterView;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class EuroConverterController {
    
    private EuroConverterModel model;
    private EuroConverterView view;
    
    public EuroConverterController(EuroConverterModel model, EuroConverterView view) {
        this.model = model;
        this.view = view;
        view.setActionListener(new EuroConverterControllerActionListener());
    }
    
    class EuroConverterControllerActionListener implements ActionListener {
        
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
                        model.setExchangeRate(newExchangeRate);
                        view.getDisplayPanel().getRateDisplay().setText("Exchange rate: " + model.getExchangeRate());
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Incorrect data format!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "euroDollar":
                    model.setTrans("mult");
                    break;
                case "dollarEuro":
                    model.setTrans("div");
                    break;
                case "convert":
                    String result = "";
                    if (model.getTrans().equals("mult")) {
                        result = model.convertmult();
                        view.getDisplayPanel().getNumbersDisplay().setText(result);
                    }
                    else if (model.getTrans().equals("div")) {
                        result = model.convertdiv();
                        view.getDisplayPanel().getNumbersDisplay().setText(result);
                    }
                    model.setNumber(result);
                    break;
                case "clear":
                    model = new EuroConverterModel();
                    view.setModel(model);
                    view.getDisplayPanel().getNumbersDisplay().setText(model.getNumber());
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