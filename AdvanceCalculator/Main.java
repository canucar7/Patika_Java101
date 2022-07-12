package AdvanceCalculator;

import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }


    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }


    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }


    static void mod(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Modu alinacak sayi giriniz : ");
        int a = scan.nextInt();

        System.out.print("Mod sayisini giriniz : ");
        int b = scan.nextInt();

        int result = a % b;
        System.out.println("Sonuc : " + result);

    }

    static void rectangleCalculate(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ilk kenari giriniz : ");
        int a = scan.nextInt();

        System.out.print("Ikinci kenari giriniz : ");
        int b = scan.nextInt();

        int perimeter = 2 * (a+b);
        int area = (a*b);

        System.out.println("Cevre : " + perimeter);
        System.out.println("Alan : " + area);

    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int push;

        String menu = "1-Toplama islemi\n"
                + "2-Cikarma islemi\n"
                + "3-Carpma islemi\n"
                + "4-Bolme islemi\n"
                + "5-Uslu sayi hesaplama\n"
                + "6-Factoriyel\n"
                + "7-Mod alma\n"
                + "8-Dikdortgen cevre ve alan\n"
                + "0-Cikis yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            push = scan.nextInt();
            switch (push) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleCalculate();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (push != 0);



    }
}
