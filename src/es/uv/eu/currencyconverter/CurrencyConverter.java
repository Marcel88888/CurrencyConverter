package es.uv.eu.currencyconverter;

import es.uv.eu.currencyconverter.controller.CurrencyConverterController;
import es.uv.eu.currencyconverter.model.CurrencyConverterModel;
import es.uv.eu.currencyconverter.view.CurrencyConverterView;


public class CurrencyConverter {

    public static void main(String[] args) {
        CurrencyConverterModel model = new CurrencyConverterModel();
        CurrencyConverterView view = new CurrencyConverterView(model);
        new CurrencyConverterController(model, view);

        view.setVisible(true);
    }
    
}
