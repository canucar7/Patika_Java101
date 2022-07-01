package ManavCasaProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double armutKilo,elmaKilo,domatesKilo,muzKilo,patlicanKilo,toplam;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kac kilo armut ? : ");
        armutKilo = scan.nextDouble();

        System.out.print("Kac kilo elma ? : ");
        elmaKilo = scan.nextDouble();

        System.out.print("Kac kilo domates ? : ");
        domatesKilo = scan.nextDouble();

        System.out.print("Kac kilo muz ? : ");
        muzKilo = scan.nextDouble();

        System.out.print("Kac kilo patlican ? : ");
        patlicanKilo = scan.nextDouble();


        double armutFiyat = armut * armutKilo;
        double elmaFiyat = elma * elmaKilo;
        double domatesFiyat = domates * domatesKilo;
        double muzFiyat = muz * muzKilo;
        double patlicanFiyat = patlican * patlicanKilo;

        toplam = armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
        System.out.println("Toplam tutar : " + toplam + " TL");


    }
}
