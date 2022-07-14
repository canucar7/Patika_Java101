package ArrayMinMax;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {15,12,788,1,-1,-778,2,0};

        int max = arr[0];
        int min = arr[0];


        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.print("Girilen sayi : ");
        int n = scan.nextInt();

        Arrays.sort(arr);
        for (int i : arr){

            if (i < n ){
                min = i;
            }

            if (i > n ) {
                max = i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
    }
}
