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
        @Override
        public String toString(){
            return 
            super.toString() +
            "\nWireless: " + this.wireless +
            "\nColor: " + this.color;

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
