package RecursiveAsal;

import java.util.Scanner;

public class Main {

    static void recAsal(int num,int b){

        if (b == num) {
            System.out.print(num + " asal sayıdır.");
            return;
        } else if (num%b == 0) {
            System.out.print(num + " asal sayı değildir.");
            return;
        }else if (num<b){
            System.out.print(num + " asal sayı değildir.");
            return;
        }


        recAsal(num,b+1);


    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int num = scan.nextInt();

        recAsal(num,2);


    }
}
