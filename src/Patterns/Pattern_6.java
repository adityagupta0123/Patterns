package Patterns;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int sp = n/2+1;
        int st = 1;
        for (int i = 1; i <= n ; i++) {
            for(int j=1; j<= sp; j++){
                System.out.print("*\t");
            }
            for(int j=1; j<= st; j++){
                System.out.print("\t");
            }
            for(int j=1; j<= sp; j++){
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st +=2;
                sp--;
            }
            else{
                st -=2;
                sp++;
            }
            System.out.println();
        }
    }
}
