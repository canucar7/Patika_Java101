package UçakBileti;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km,age,type;
        double perKm = 0.10;
        double cost,discountRate,ageDiscount,typeDiscount,newCost ,lastCost;
        double typeRate = 0.20;



        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi km turunden giriniz : ");
        km = scan.nextInt();

        System.out.print("Yasinizi giriniz : ");
        age = scan.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 => Tek yon, 2 => Gidis donus) : ");
        type = scan.nextInt();

        cost = perKm*km;


        if ((km>0) && (age>0) && ((type==1) || (type==2)) ){

            if (type==2){
                if (age < 12){
                    discountRate = 0.5;
                    ageDiscount = cost*discountRate;
                    newCost = cost - ageDiscount;
                    typeDiscount = newCost  * typeRate;
                    lastCost = (newCost-typeDiscount)*2;
                    System.out.print("Toplam tutar : " + lastCost);
                }else if (age>=12 && age<=24) {
                    discountRate = 0.1;
                    ageDiscount = cost*discountRate;

                    newCost = cost - ageDiscount;

                    typeDiscount = newCost  * typeRate;

                    lastCost = (newCost-typeDiscount)*2;


                    System.out.print("Toplam tutar : " + lastCost);

                }else if (age>65) {
                    discountRate = 0.3;
                    ageDiscount = cost*discountRate;
                    newCost = cost - ageDiscount;
                    typeDiscount = newCost * typeRate;
                    lastCost = (newCost-typeDiscount)*2;
                    System.out.print("Toplam tutar : " + lastCost);
                }else{
                    System.out.print("Toplam tutar : " + (cost*2));
                }


            }else{
                if (age < 12){
                    discountRate = 0.5;
                    ageDiscount = cost*discountRate;
                    lastCost = (cost -ageDiscount);
                    System.out.print("Toplam tutar : " + lastCost);
                }else if (age>=12 && age<=24) {
                    discountRate = 0.1;
                    ageDiscount = cost*discountRate;
                    lastCost = (cost - ageDiscount);
                    System.out.print("Toplam tutar : " + lastCost);

                }else if (age>65) {
                    discountRate = 0.3;
                    ageDiscount = cost*discountRate;
                    lastCost = (cost - ageDiscount);
                    System.out.print("Toplam tutar : " + lastCost);
                }else{
                    System.out.print("Toplam tutar : " + cost);
                }



            }




        }else System.out.print("Hatali veri girdiniz! ");



    }
}
