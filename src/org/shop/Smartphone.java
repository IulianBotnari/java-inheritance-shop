package org.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Product {

    protected String IMEI;
    protected int memorySize;

    public Smartphone(int code, String name, String brand, BigDecimal price, byte iva, boolean isFidelity, String IMEI, int memorySize){
        super(code, name, brand, price, iva, isFidelity);

    this.IMEI = IMEI;
    this.memorySize = memorySize;
    }

    // get smartphone methods


    public String getImei(){
        return this.IMEI;
    }

    public String getMemorySize(){
        return  this.memorySize + "GB";
    }

    @Override
    public String toString(){
        return 

        super.toString() +

        "\nIMEI: " + this.IMEI + 
        "\nMemoria: " + this.memorySize + "GB";
      
    }


    @Override
    public BigDecimal totalPrice(){
        BigDecimal ivaPrice = this.price.multiply(BigDecimal.valueOf(this.iva)).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);

        if (memorySize < 32) {
            return this.price.add(ivaPrice).subtract(this.price.add(ivaPrice).multiply(BigDecimal.valueOf(0.1f))).setScale(2, RoundingMode.HALF_UP);
        } else{

            return super.totalPrice().setScale(2, RoundingMode.HALF_UP);
        }
     


    };


    


    // set smartphone methods

    public void setImei(String IMEI){
        this.IMEI = IMEI;
    }

    public void setMemorySize(int memorySize){
        this.memorySize = memorySize;
    }





    
}
