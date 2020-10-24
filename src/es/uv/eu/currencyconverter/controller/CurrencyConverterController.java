package es.uv.eu.currencyconverter.controller;

import es.uv.eu.currencyconverter.model.CurrencyConverterModel;
import es.uv.eu.currencyconverter.view.CurrencyConverterView;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CurrencyConverterController {
    
    private CurrencyConverterModel model;
    private CurrencyConverterView view;
    
    public CurrencyConverterController(CurrencyConverterModel model, CurrencyConverterView view) {
        this.model = model;
        this.view = view;
        view.addWindowListener(new CurrencyConverterControllerWindowListener());
        view.setActionListener(new CurrencyConverterControllerActionListener());
    }
    
    class CurrencyConverterControllerWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
    
    class CurrencyConverterControllerActionListener implements ActionListener {
        
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
                        UIManager.put("OptionPane.okButtonText", "Accept");
                        newExchangeRate = Float.parseFloat(JOptionPane.showInputDialog(null, 
                                "New exchange rate"));
                        model.setExchangeRate(newExchangeRate);
                        view.getDisplayPanel().getRateDisplay().setText("Exchange rate: " + model.getExchangeRate());
                    } 
                    catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Incorrect data format!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    catch (NullPointerException e) {}
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
                    model = new CurrencyConverterModel();
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