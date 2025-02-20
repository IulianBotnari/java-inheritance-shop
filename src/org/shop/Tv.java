package org.shop;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Tv extends Product{

    DecimalFormat formattaNumeriDecimali = new DecimalFormat("0.##");

    protected float width;
    protected float heigth;
    protected boolean smart;


    public Tv(int code, String name, String brand, BigDecimal price, byte iva, float width, float heigth, boolean smart){
        super(code, name, brand, price, iva);

        this.width = width;
        this.heigth = heigth;
        this.smart = smart;
    }
    // get tv methods
    public String getTvInfo(){
        return 
        "Info TV: " +
        "\nCodice: " + this.getProductCode() +
        "\nNome prodotto: " + this.name +
        "\nBrand prodotto: " + this.brand + 
        "\nLarghezza: " + formattaNumeriDecimali.format(this.width) + 
        "\nAltezza: " + formattaNumeriDecimali.format(this.heigth) +
        "\nSmart: " + this.smart +
        "\nPrezzo: " + this.price + 
        "\nIva: " + this.iva;
    }

    public float getTvWidth(){
        return this.width;
    }

    public float getTvHeigth(){
        return this.heigth;
    }

    public boolean getTvSmart(){
        return this.smart;
    }


    // set tv methods
    public void setTvWidth(float width){
        this.width = width;
    }

    public void setTvHeigth(float heigth){
        this.heigth = heigth;
    }

    public void setTvSmart(boolean smart){
        this.smart = smart;
    }

    
}
