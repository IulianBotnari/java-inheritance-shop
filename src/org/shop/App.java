package org.shop;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        
        Smartphone SmartphoneNumero1 = new Smartphone(500, "ROG", "Asus", BigDecimal.valueOf(1000), (byte)22, true, "4964646546456496", 6);
        System.out.println(SmartphoneNumero1);

        // System.out.println();
        // Tv Tvnumero1 = new Tv(600, "SmartTV", "Samsung", BigDecimal.valueOf(1000), (byte) 22, 200, 100, true);
        // Tvnumero1.setTvHeigth(100.32f);
        // Tvnumero1.setTvWidth(200.56f);

        // System.out.println();


        // Headphones cuffie1 = new Headphones(700, "Beats", "Apple",BigDecimal.valueOf(200), (byte)22, "Blu", true);

        System.out.println(SmartphoneNumero1.totalPrice());

    
    
    }

    
}
