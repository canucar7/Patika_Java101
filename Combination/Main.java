package Combination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nFact=1;
        int rFact=1;
        int n_rFact =1;

        Scanner scan = new Scanner(System.in);
        System.out.print("n sayisini giriniz : ");
        int n = scan.nextInt();

        System.out.print("r sayisini giriniz : ");
        int r = scan.nextInt();


        for (int i=1; i<=n ; i++){
            nFact*=i;
        }

        for (int j=1; j<=r ; j++){
            rFact*=j;
        }

        int nDiffr=n-r;

        for (int k=1; k<=nDiffr ; k++){
            n_rFact*=k;
        }

        double combination =  nFact / ( rFact * n_rFact );
        System.out.println("n : " + n + " r : " + r + " combination : " + combination);



    }
}
