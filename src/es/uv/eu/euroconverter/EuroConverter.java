package es.uv.eu.euroconverter;

import es.uv.eu.euroconverter.controller.EuroConverterController;
import es.uv.eu.euroconverter.model.EuroConverterModel;
import es.uv.eu.euroconverter.view.EuroConverterView;


public class EuroConverter {

    public static void main(String[] args) {
        EuroConverterModel model = new EuroConverterModel();
        EuroConverterView view = new EuroConverterView(model);
        new EuroConverterController(model, view);

        view.setVisible(true);
    }
    
}
