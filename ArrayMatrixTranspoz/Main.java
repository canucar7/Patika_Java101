package ArrayMatrixTranspoz;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("matris kaç satırlı ? : ");
        int length = scan.nextInt();
        System.out.print("matris kaç kolonlu ? : ");
        int weight = scan.nextInt();
        System.out.println("matrisin elemanlarını sırasıyla giriniz : ");

        int[][] arr = new int[length][weight];


        for (int i=0 ; i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("==================================");
        System.out.println("matrix : ");

        for(int i =0  ; i < arr.length;i++){
            for(int j = 0 ; j < arr[i].length;j++)
                System.out.print(arr[i][j]+"   ");
            System.out.println();
        }

        System.out.println("------------");
        System.out.println("matrixin transpozu : ");

        for(int j = 0 ; j < arr[0].length;j++){
            for(int i =0  ; i < arr.length;i++){
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }


    }
}
