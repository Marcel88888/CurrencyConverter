package es.uv.eu.euroconverter.model;

public final class EuroConverterModel {
  
    private float exchangeRate = (float) 1.11253;
    private String number, trans="mult";
    private boolean newNumber;
    
    
    public EuroConverterModel() {
        reset();
    }

    public String addDigit(String d) {
        
        switch (d) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                if (newNumber) {
                    number = d;
                    newNumber = false;
                }
                else {
                    number += d;
                }
                break;
        
            case ".":
                if (newNumber) {
                    newNumber = false;
                    number = "0.";
                }
                else if (!number.contains(".")) {
                    number += ".";
                }
                break;
                
            case "C":
                if (newNumber) {
                    reset();
                }
                else if (number.length() > 1) {
                    number = number.substring(0, number.length()-1);
                }
                else if (number.length() == 1) {
                    newNumber = true;
                    number = "0";
                }
                break;
        }
        return number;
    }
    
    public String convertmult() {
        float c = Float.parseFloat(number) * exchangeRate;
        newNumber = true;
        return String.format("%.02f", c).replace(",", ".");
    }
    public String convertdiv() {
        float c = Float.parseFloat(number)/ exchangeRate;
        newNumber = true;
        return String.format("%.02f", c).replace(",", ".");
    }
    public final String reset() {
        number = "0";
        newNumber = true;
        return number;
    }    

    public void setExchangeRate(float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    public String getExchangeRate() {
        return String.valueOf(exchangeRate);
    }
    
    public void setTrans(String trans){
        this.trans=trans;
    }
    public String getTrans(){
        return trans;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
