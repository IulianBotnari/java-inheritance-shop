package org.shop;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        
        Smartphone SmartphoneNumero1 = new Smartphone(500, "ROG", "Asus", BigDecimal.valueOf(1000), (byte)800, "4964646546456496", "256 GB");
        System.out.println(SmartphoneNumero1.getSmartphoneInfo());

        System.out.println();
        Tv Tvnumero1 = new Tv(600, "SmartTV", "Samsung", BigDecimal.valueOf(1000), (byte) 22, 200, 100, true);
        Tvnumero1.setTvHeigth(100.32f);
        Tvnumero1.setTvWidth(200.56f);
        System.out.println(Tvnumero1.getTvInfo());
    }

    
}
