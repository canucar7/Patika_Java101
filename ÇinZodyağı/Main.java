package ÇinZodyağı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yearOfBirth;
        String burc = " ";
        boolean isError = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Dogum yilini giriniz : ");
        yearOfBirth = scan.nextInt();

        switch (yearOfBirth%12){
            case 0:
                burc = "maymun";
                isError = true;
                break;
            case 1 :
                burc = "horoz";
                isError = true;
                break;
            case 2 :
                burc = "kopek";
                isError = true;
                break;
            case 3 :
                burc = "domuz";
                isError = true;
                break;
            case 4 :
                burc = "fare";
                isError = true;
                break;
            case 5 :
                burc = "okuz";
                isError = true;
                break;
            case 6 :
                burc = "kaplan";
                isError = true;
                break;
            case 7 :
                burc = "tavsan";
                isError = true;
                break;
            case 8 :
                burc = "ejderha";
                isError = true;
                break;
            case 9 :
                burc = "yilan";
                isError = true;
                break;
            case 10 :
                burc = "at";
                isError = true;
                break;
            case 11 :
                burc = "koyun";
                isError = true;
                break;

        }

        if (isError == true){
            System.out.println("Burcunuz : " + burc);

        }else System.out.println("Hatali giris ");



    }
}
