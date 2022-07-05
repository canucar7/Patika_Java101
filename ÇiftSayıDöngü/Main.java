package ÇiftSayıDöngü;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i,sum=0,count=0;
        double avg;


        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        i = scan.nextInt();


        for (int j=1 ;j<=i ;j++){

            if ((j%3==0) && (j%4==0)){
                sum+=j;
                count++;
            }

        }

        avg = sum/(count);
        System.out.print("3 ve 4 sayilarina bolunebilen sayilarin ortalama : " + avg);


    }
}
