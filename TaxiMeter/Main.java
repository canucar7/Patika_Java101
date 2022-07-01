package TaxiMeter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mesafe;
        double sabit = 2.20;
        int baslangic = 10;

        Scanner scan = new Scanner(System.in);

        System.out.print("Gidilen mesafyi girin : ");
        mesafe = scan.nextDouble();

        double tutar = baslangic + (mesafe * sabit);
        System.out.println("Tutar : " + tutar);


         tutar= (tutar <=20) ?20:tutar;

        System.out.print("Odenecek fiyat : " + tutar);


    }
}
