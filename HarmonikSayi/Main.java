package HarmonikSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double total = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("N sayisi girin : ");
        int n = scan.nextInt();

        for (int i=1; i<=n ; i++)  {
            total += (1.0/i);

        }
        System.out.print("Toplam : " + total);
    }
}
