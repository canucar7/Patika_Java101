package PerfectNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum=0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        number = scan.nextInt();

        for (int i = number-1; i>0 ; i--){
            if (number%i == 0){
                sum += i ;
            }
        }

        if (sum == number){
            System.out.println(number + " bir mukemmel sayidir");
        }
        else System.out.println(number + " bir mukemmel sayi degildir");
    }
}
