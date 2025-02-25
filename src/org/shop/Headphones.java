package org.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Headphones extends Product {


    protected String color;
    protected boolean wireless;
    


    public Headphones(int code, String name, String brand, BigDecimal price, byte iva, boolean isFidelity, String color, boolean wireless){
        super(code, name, brand, price, iva, isFidelity);

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

        @Override
        public BigDecimal totalPrice(){
            BigDecimal ivaPrice = this.price.multiply(BigDecimal.valueOf(this.iva)).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);

            if (!wireless) {
                return this.price.add(ivaPrice).subtract(this.price.add(ivaPrice).multiply(BigDecimal.valueOf(0.07f))).setScale(2, RoundingMode.HALF_UP);
            } else{

                return super.totalPrice().setScale(2, RoundingMode.HALF_UP);
            }
         


        };
    
    
        // set tv methods


        public void setHeadphonesColor(String color){
            this.color = color;

        }

        public void setHeadphonesType(boolean wireless){
            this.wireless = wireless;
        }



    
}
