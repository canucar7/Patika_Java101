package Atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String username,password;
        int attemp =3;
        int money =1500;
        int select;

        Scanner scan = new Scanner(System.in);

        while (attemp>0) {

            System.out.print("Kullanici adiniz : ");
            username = scan.nextLine();

            System.out.print("Sifre giriniz : ");
            password = scan.nextLine();

            if ((username.equals("patika")) &&(password.equals("1234"))){
                System.out.println("Merhaba hos geldiniz. ");


                do {
                    System.out.println(" 1-Para Cekme\n 2-Para Yatirma\n 3-Bakiye sorgu\n 4-Cikis yap");
                    System.out.print("Yapmak istediginiz islemi seciniz : ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Cekmek istediginiz tutari giriniz : ");
                            int a =scan.nextInt();

                            if (a<=money){
                                money -=a;
                                System.out.println("Yeni bakiyeniz : " + money);
                            }else{
                                System.out.println("Yeterli bakiyeniz yok ");
                            }
                            break;

                        case 2:
                            System.out.print("Yatirmak istediginiz tutari giriniz : ");
                            int b =scan.nextInt();
                            money +=b;
                            System.out.println("Yeni bakiyeniz : " + money);
                            break;

                        case 3 :
                            System.out.println("Bakiyeniz : " + money);
                            break;

                        case 4 :
                            System.out.println("Tekrar gorusmek uzere ");
                            break;


                    }

                }while (select != 4);break;





            }else{
                attemp--;
                System.out.println("Hatali kullanici adi ya da sifre. Lutfen tekrar deneyiniz ");
                if (attemp==0){
                    System.out.println("Hesabiniz bloke olmustur.");

                }else {
                    System.out.println("Kalan hakkiniz : " + attemp);
                }


            }


        }

    }
}
