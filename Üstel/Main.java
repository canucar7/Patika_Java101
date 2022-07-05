package Üstel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        int total =1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ussu alinacak sayi : ");
        a = scan.nextInt();

        System.out.print("Us olacak sayi : ");
        b = scan.nextInt();

        for (int i =1 ; i<=b ; i++){
            total *=a;
        }

        System.out.print(a + " ussu " + b + " = " + total);




    }
}
