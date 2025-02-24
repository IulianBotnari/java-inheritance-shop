package org.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Product[] products = new Product[2];

        Scanner input = new Scanner(System.in);

       
        for (int i = 0; i<products.length; i++){

            System.out.println("Inserisci codice del prodotto: ");
            int productCode = input.nextInt();
            input.nextLine();
            System.out.println("Inserisci nome del prodotto: ");
            String productName = input.nextLine();

            System.out.println("Inserisci marca del prodotto: ");
            String productBrand = input.nextLine();
    

            System.out.println("Inserisci il prezzo: ");
            BigDecimal productPrice = input.nextBigDecimal();
            input.nextLine(); 

            System.out.println("Inserisci iva: ");
            byte productIva = input.nextByte();
            input.nextLine(); 

            System.out.println("Il prodotto è uno smartphone, una tv oppure delle cuffie?");
            String productType = input.nextLine().toLowerCase();
            System.out.println(productType);

            switch (productType) {
                case "cuffie":
                    System.out.println("Inserisci colore delle cuffie: ");
                    String color = input.nextLine();

                    System.out.println("Inserisci true o false se le cuffie sono wireless: ");
                    Boolean wireless = input.nextBoolean();

                    Headphones cuffie = new Headphones(productCode, productName, productBrand, productPrice, (byte) productIva, color, wireless);

                    products[i] = cuffie;


                    
                    break;

                    case "tv":
                    System.out.println("Inserisci larghezza tv: ");
                    float width = input.nextFloat();

                    System.out.println("Inserisci altezza tv: ");
                    float heigth = input.nextFloat();
                    

                    System.out.println("Inserisci true o false se la tv smart: ");
                    Boolean smart = input.nextBoolean();

                    Tv tv = new Tv(productCode, productName, productBrand, productPrice, (byte) productIva, width, heigth, smart);

                    products[i] = tv;

                    
                    break;
                    case "smartphone":

                    System.out.println("Inserisci IMEI: ");
                    String IMEI = input.nextLine();
                    

                    System.out.println("Inserisci quantita di memoria: ");
                    String memorySize = input.nextLine();

                    
                    Smartphone Smartphone = new Smartphone(productCode, productName, productBrand, productPrice, (byte) productIva, IMEI, memorySize);

                    products[i] = Smartphone;
                    
                    break;



            
                default:
                    break;
            }
    
        }
       
        

        input.close();

        System.out.println("--------Carrello---------");

        for(Product product : products){
            System.out.println(product.toString());
            System.out.println("----------------");
        }
      
    }
}
