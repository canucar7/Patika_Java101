package BurçBulmak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun,ay;
        String burc= "";
        boolean isError = false;



        Scanner scan = new Scanner(System.in);

        System.out.print("Dogdunuz gunu giriniz : ");
        gun = scan.nextInt();

        System.out.print("Dogdunuz ayi giriniz : ");
        ay = scan.nextInt();

        if (ay == 1) {
            if (gun > 0 && gun <= 21) {
                burc= "Oğlak";
            } else if (gun > 21 && gun <= 31) {
                burc= "Kova";
            } else
                isError = true;

        } else if (ay == 2) {
            if (gun > 0 && gun <= 19) {
                burc= "Kova";
            } else if (gun > 19 && gun <= 29) {
                burc= "Balık";
            } else
                isError = true;

        } else if (ay == 3) {
            if (gun > 0 && gun <= 20) {
                burc= "Balık";
            } else if (gun > 20 && gun <= 31) {
                burc= "Koç";
            } else
                isError = true;

        } else if (ay == 4) {
            if (gun > 0 && gun <= 20) {
                burc= "Koç";
            } else if (gun > 20 && gun <= 30) {
                burc= "Boğa";
            } else
                isError = true;

        } else if (ay == 5) {
            if (gun > 0 && gun <= 21) {
                burc= "Boğa";
            } else if (gun > 21 && gun <= 31) {
                burc= "İkizler";
            } else
                isError = true;

        } else if (ay == 6) {
            if (gun > 0 && gun <= 22) {
                burc= "İkizler";
            } else if (gun > 22 && gun <= 30) {
                burc= "Yengeç";
            } else
                isError = true;

        } else if (ay == 7) {
            if (gun > 0 && gun <= 22) {
                burc= "Yengeç";
            } else if (gun > 22 && gun <= 31) {
                burc= "Aslan";
            } else
                isError = true;

        } else if (ay == 8) {
            if (gun > 0 && gun <= 22) {
                burc= "Aslan";
            } else if (gun > 22 && gun <= 31) {
                burc= "Başak";
            } else
                isError = true;

        } else if (ay == 9) {
            if (gun > 0 && gun <= 22) {
                burc= "Başak";
            } else if (gun > 22 && gun <= 30) {
                burc= "Terazi";
            } else
                isError = true;

        } else if (ay == 10) {
            if (gun > 0 && gun <= 22) {
                burc= "Terazi";
            } else if (gun > 22 && gun <= 31) {
                burc= "Akrep";
            } else
                isError = true;

        } else if (ay == 11) {
            if (gun > 0 && gun <= 21) {
                burc= "Akrep";
            } else if (gun > 21 && gun <= 30) {
                burc= "Yay";
            } else
                isError = true;

        } else if (ay == 12) {
            if (gun > 0 && gun <= 21) {
                burc= "Yay";
            } else if (gun > 21 && gun <= 31) {
                burc= "Oğlak";
            } else
                isError = true;
        }

        if ((ay > 12) || (ay < 1)) {
            System.out.println("Hatali giris yaptiniz. Lütfen tekrar deneyiniz.");
        } else if (isError) {
            System.out.println("Hatali giris yaptiniz. Lütfen tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz : " + burc);
        }

    }
}
