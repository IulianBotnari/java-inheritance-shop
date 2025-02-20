package org.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

    protected String IMEI;
    protected String memorySize;

    public Smartphone(int code, String name, String brand, BigDecimal price, byte iva, String IMEI, String memorySize){
        super(code, name, brand, price, iva);

    this.IMEI = IMEI;
    this.memorySize = memorySize;
    }

    // get smartphone methods


    public String getImei(){
        return this.IMEI;
    }

    public String getMemorySize(){
        return  this.memorySize;
    }


    public String getSmartphoneInfo(){
        return 
        "Info Smartphone: " +
        "\nCodice: " + this.getProductCode() +
        "\nNome prodotto: " + this.name +
        "\nBrand prodotto: " + this.brand + 
        "\nIMEI: " + this.IMEI + 
        "\nMemoria: " + this.memorySize +
        "\nPrezzo: " + this.price + 
        "\nIva: " + this.iva;
    }

    


    // set smartphone methods

    public void setImei(String IMEI){
        this.IMEI = IMEI;
    }

    public void setMemorySize(String memorySize){
        this.memorySize = memorySize;
    }





    
}
