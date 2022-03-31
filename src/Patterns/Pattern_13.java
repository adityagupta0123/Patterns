package Patterns;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            int icj = 1;
            for (int j = 0; j <= i ; j++) {
                System.out.print(icj + "\t");
                int icj_p1 = icj * (i-j) / (j+1);
                icj = icj_p1;
            }
            System.out.println();
        }
    }
}
