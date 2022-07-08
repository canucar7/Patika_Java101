package EnBüyükEnKüçük;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n ,number,min =1,max=1;


        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi adaeti giriniz : ");
        n =scan.nextInt();

        for (int i =1; i<=n ;i++){
            System.out.print(i + ". sayiyi giriniz : " );
            number = scan.nextInt();

            if (i==1){
                min = number;
                max = number;
            }

            if (number > max) {
                max = number;
            }

            if (number<min){
                min = number;
            }

        }

        System.out.println("Max sayi : " + max);
        System.out.println("Min sayi : " + min);

    }
}
