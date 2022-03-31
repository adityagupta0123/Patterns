package Patterns;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int a =0 , b=1, c;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a+"\t");
                c = a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
