package BodyMassIndex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo,boy;

        Scanner scan = new Scanner(System.in);

        System.out.print("Boyunuzu giriniz : ");
        boy = scan.nextDouble();

        System.out.print("Kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        double index = kilo / (boy * boy) ;

        System.out.print("Vucut kitle indexiniz : " + index);


    }
}
