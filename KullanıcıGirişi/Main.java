package KullanıcıGirişi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,password,newPassword;
        int sifreSifir;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz : ");
        userName = scan.nextLine();

        System.out.print("Sifrenizi giriniz : ");
        password = scan.nextLine();

        if (userName.equals("patika")){
            if (password.equals("1234")){
                System.out.println("Giris yaptiniz ");
            }
            else{
                System.out.println("Sifreniz yanlis !!! ");
                System.out.println("Sifreyi sifirlamak icin : 1\nCikis yapmak icin herhangi bir sayi tuslayiniz ");
                System.out.print("Seciminiz : ");
                sifreSifir = scan.nextInt();
                if (sifreSifir == 1){
                    System.out.print("Yeni sifre giriniz : ");

                    scan.nextLine();
                    newPassword = scan.nextLine();

                    if (newPassword.equals("1234") || newPassword.equals(password)){
                        System.out.print("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                    }else {
                        System.out.print("Sifre olusturuldu");
                    }

                }else System.out.print("Cikis yaptiniz ");

            }
        }else{
            System.out.print("Hatali kullanici adi  !");
        }



    }
}
