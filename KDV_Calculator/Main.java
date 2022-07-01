package KDV_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat ;
        double kdvOran =0.18;
        double kdv;

        Scanner scan = new Scanner(System.in);

        System.out.print("Fiyat giriniz : ");
        fiyat = scan.nextDouble();
        System.out.println("Kdvsiz tutar: " + fiyat);


        kdv = fiyat * kdvOran;
        System.out.println("kdv tutari : " + kdv);

        fiyat += kdv;
        System.out.print("kdvli fiyat : " + fiyat);

    }
}
