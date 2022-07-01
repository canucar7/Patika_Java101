package NotOrtalama;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int mat,fiz,kim,tur,tar,muz;

        Scanner inp = new Scanner(System.in);
        System.out.print("mat notu gir:");
         mat = inp.nextInt();

        System.out.print("fiz notu gir:");
         fiz = inp.nextInt();

        System.out.print("kim notu gir:");
         kim = inp.nextInt();

        System.out.print("tür notu gir:");
         tur = inp.nextInt();

        System.out.print("tar notu gir:");
         tar = inp.nextInt();

        System.out.print("müz notu gir:");
         muz = inp.nextInt();

         int toplam = (mat + fiz + kim + tur + tar + muz);
        double ort = toplam / 6.0;

        System.out.println("ortalama = " + ort );

        boolean b = ort >= 60.0;
        String sonuc = b ? "geçti" :"kaldı";
        System.out.print(sonuc);

    }
}
