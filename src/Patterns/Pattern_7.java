package Patterns;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
//        int st = 1;
        for (int i = 1; i <= n ; i++) {
//            for (int j=1; j<=i; j++)
//                System.out.print("\t");
//            for (int j = 1; j <=st ; j++) {
//                System.out.print("*\t");
//            }
            for (int j = 1; j <=i ; j++) {
                if (i == j)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }
}
