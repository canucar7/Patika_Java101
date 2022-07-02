package SınıfGeçmeDurumu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = scan.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = scan.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = scan.nextInt();


        if(mat<0 || mat>100)
            mat =0;

        if(fizik<0 || fizik>100)
            fizik =0;

        if(turkce<0 || turkce>100)
            turkce =0;

        if(kimya<0 || kimya>100)
            kimya =0;

        if(muzik<0 || muzik>100)
            muzik =0;


        double average = (mat + fizik + turkce + kimya + muzik) / 5 ;

        if (average < 55){
            System.out.println("Sinifta kaldınız ");


        }else {
            System.out.println("Sinifi geçtiniz ");

        }

        System.out.println("Ortalama : " + average);


    }

}
