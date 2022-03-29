package Patterns;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();

//        for (int i = n; i >= 1 ; i--) {
//            for (int j = 1; j <= i ; j++) {
//                if (i == j)
//                    System.out.print("*\t");
//                else
//                    System.out.print("\t");
//
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if (i + j == n+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");

            }
            System.out.println();
        }
    }
}
