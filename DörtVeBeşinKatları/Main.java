package DörtVeBeşinKatları;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int j=1;
        int i =1;
        int k;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        k = scan.nextInt();

        while (i<=k) {
            System.out.println(i + " - Dort sayisinin katidir ");
            i*=4;
        }

        while ( j<=k) {
            System.out.println(j + " - Bes sayisinin katidir ");
            j*=5;
        }
    }
}
