package org.shop;

import java.math.BigDecimal;

public class Headphones extends Product {

    protected String color;
    protected boolean wireless;


    public Headphones(int code, String name, String brand, BigDecimal price, byte iva, String color, boolean wireless){
        super(code, name, brand, price, iva);

        this.color = color;
        this.wireless = wireless;

    }

        // get tv methods
        public String getHeadPhoneInfo(){
            return 
            "Info Cuffie: " +
            "\nCodice: " + this.getProductCode() +
            "\nNome prodotto: " + this.name +
            "\nBrand prodotto: " + this.brand + 
            "\nWireless: " + this.wireless +
            "\nColor: " + this.color +
            "\nPrezzo: " + this.price + 
            "\nIva: " + this.iva;
        }
    
        public String getHeadphonesColor(){
            return this.color;
        }
    
        public boolean getHeadphonesType(){
           return this.wireless;
        }
    
    
        // set tv methods


        public void setHeadphonesColor(String color){
            this.color = color;

        }

        public void setHeadphonesType(boolean wireless){
            this.wireless = wireless;
        }



    
}
