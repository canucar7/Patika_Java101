package RecursiveÜslü;

import java.util.Scanner;

public class Main {

    static int result =1;

    static int rec(int a,int b){

        if (b == 0)
            return 1;

        result *=a;
        rec(a,b-1);

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Taban degeri giriniz : ");
        int a = scan.nextInt();

        System.out.print("Ust degeri giriniz : ");
        int b = scan.nextInt();

        System.out.println(rec(a,b));

    }
}
