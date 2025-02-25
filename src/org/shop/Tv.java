package org.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Tv extends Product{

    DecimalFormat formattaNumeriDecimali = new DecimalFormat("0.##");

    protected float width;
    protected float heigth;
    protected boolean smart;


    public Tv(int code, String name, String brand, BigDecimal price, byte iva, boolean isFidelity, float width, float heigth, boolean smart){
        super(code, name, brand, price, iva, isFidelity);

        this.width = width;
        this.heigth = heigth;
        this.smart = smart;
    }
    // get tv methods
    @Override
    public String toString(){
        return 

        super.toString() +
        "\nLarghezza: " + formattaNumeriDecimali.format(this.width) + 
        "\nAltezza: " + formattaNumeriDecimali.format(this.heigth) + 
        "\nSmart: " + this.smart;

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

    @Override
    public BigDecimal totalPrice(){
        BigDecimal ivaPrice = this.price.multiply(BigDecimal.valueOf(this.iva)).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);

        if (!smart) {
            return this.price.add(ivaPrice).subtract(this.price.add(ivaPrice).multiply(BigDecimal.valueOf(0.1f))).setScale(2, RoundingMode.HALF_UP);
        } else{

            return super.totalPrice().setScale(2, RoundingMode.HALF_UP);
        }
     


    };


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
