package SayılarıSıralama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,y,z;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        x = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz : ");
        y = scan.nextInt();

        System.out.print("Ucuncu sayiyi giriniz : ");
        z = scan.nextInt();

        if(x > y && x > z){
            if(y > z){
                System.out.println(x + " > " + y + " > " + z);
            }else {
                System.out.println(x + " > " + z + " > " + y);
            }

        }else if(y > x && y > z){
            if(x > z){
                System.out.println(y + " > " + x + " > " + z);
            }else{
                System.out.println(y + " > " + z + " > " + x);
            }

        }else if(z > x && z > y) {
            if (x > y) {
                System.out.println(z + " > " + x + " > " + y);
            } else {
                System.out.println(z + " > " + y + " > " + x);
            }
        }

    }
}
