package ArtıkYılHesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yil;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        yil = scan.nextInt();

        if ((yil%4 == 0)){
            if(yil%100 == 0){
                if (yil%400 == 0){
                    System.out.print(yil + " bir artik yildir !");
                }else System.out.print(yil + " bir artik yil degildir !");
            }
            else System.out.print(yil + " bir artik yildir !");


        }
        else System.out.print(yil + " bir artik yil degildir !");
    }
}
