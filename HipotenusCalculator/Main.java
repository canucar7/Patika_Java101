package HipotenusCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner scan = new Scanner(System.in);

        System.out.print("1. kenari giriniz : ");
        a = scan.nextInt();

        System.out.print("2. kenari giriniz : ");
        b = scan.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus : " + c );
    }
}
