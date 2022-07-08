package ReverseTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        n = scan.nextInt();

        for (int x = n - 1; x > 0; x--){


            for (int y = 1; y <= (n - x); y++) {
                System.out.print(" ");
            }


            for (int z = 1; z <= (x * 2 - 1); z++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
