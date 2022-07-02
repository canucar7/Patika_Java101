package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s1,s2,operate;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        s1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz : ");
        s2 = scan.nextInt();

        System.out.println("1.Toplama \n2.Cikarma \n3.Carpma \n4.Bolme ");
        System.out.print("Seciminiz : ");
        operate = scan.nextInt();

        switch (operate){
            case 1 :
                System.out.print("Toplama islemi sectiniz : " + (s1 + s2));
                break;
            case 2 :
                System.out.print("Cikarma islemi sectiniz : " + (s1 - s2));
                break;
            case 3 :
                System.out.print("Carpma islemi sectiniz : " + (s1 * s2));
                break;
            case 4 :
                if (s2 == 0){
                    System.out.print("Bir sayi 0 a bolunemez");
                }
                else {
                    System.out.print("Bolme islemi sectiniz : " + (s1 / s2));
                }
                break;
            default:
                System.out.print("Yanlis deger girdiniz !");
        }
    }
}
