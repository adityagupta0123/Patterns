package Patterns;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int sp = 2 * n-3;
        int st  = 1 ;
        for(int i=1; i <= n ; i++){
            for (int j = 1; j <= st ; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st++;
            sp -=2;

            System.out.println();
        }

    }
}
