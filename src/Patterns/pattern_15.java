package Patterns;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
        int sp = n/2;
        int st = 1;
        int n1=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print("\t");
            }
            int n2 = n1;
            for (int j = 1; j <= st ; j++) {
                    System.out.print(n2+"\t");

                    if(j <= st/2)
                        n2++;
                    else
                        n2--;
            }

            if (i <= n/2) {
                n1++;
                sp--;
                st+=2;
            }
            else {
                n1--;
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
}
