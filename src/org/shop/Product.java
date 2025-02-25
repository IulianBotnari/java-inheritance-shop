package org.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {

    private int code;
    protected String name;
    protected String brand;
    protected BigDecimal price;
    protected byte iva;
    protected boolean isFidelity;

    public Product(int code, String name, String brand, BigDecimal price, byte iva, boolean isFidelity) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.isFidelity = isFidelity;

    }

    // set methods

    public void setProductName(String name) {
        this.name = name;
    }

    public void setProductBrand(String brand) {
        this.brand = brand;
    }

    public void setProductprice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) >= 0) {
            this.price = price;
        } else {
            System.out.println("Il valore inserito non è valido");
        }
    }

    public void setProductIva(byte iva) {
        if (iva >= 0) {
            this.iva = iva;

        } else {
            System.out.println("Il valore inserito non è valido");
        }
    }

    // get methods

    
    public String toString(){
        return 
        "Info: " +
        "\nCodice: " + this.getProductCode() +
        "\nNome prodotto: " + this.name +
        "\nBrand prodotto: " + this.brand + 
        "\nPrezzo: " + this.price + 
        "\nIva: " + this.iva;
    }


    public int getProductCode() {
        return this.code;
    }

    public String getProductName() {
        return this.name;
    }

    public String getProductBrand() {
        return this.brand;
    }

    public BigDecimal getProductPrice() {
        return this.price;
    }

    public byte getProductIva() {
        return this.iva;
    }

    public BigDecimal totalPrice(){
        BigDecimal ivaPrice = this.price.multiply(BigDecimal.valueOf(this.iva)).divide(BigDecimal.valueOf(100)).setScale(2, RoundingMode.HALF_UP);
        if (isFidelity) {
            return this.price.add(ivaPrice).subtract(this.price.add(ivaPrice).multiply(BigDecimal.valueOf(0.02f))).setScale(2, RoundingMode.HALF_UP);
        } else{

            return this.price.add(ivaPrice).setScale(2, RoundingMode.HALF_UP);
        }
        


    }
}
