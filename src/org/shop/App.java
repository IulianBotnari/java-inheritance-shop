package org.shop;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {
        
        Smartphone SmartphoneNumero1 = new Smartphone(500, "ROG", "Asus", BigDecimal.valueOf(1000), (byte)800, "4964646546456496", "256 GB");
        System.out.println(SmartphoneNumero1.getSmartphoneInfo());
    }

    
}
