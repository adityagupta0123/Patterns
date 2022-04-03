package Patterns;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
//            for (int j = 1; j <= n ; j++) {
                System.out.print(n + "\tX\t"+ i +"\t=\t" + n * i );
//            }
            System.out.println();

        }
    }
}
