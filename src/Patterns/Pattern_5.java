package Patterns;
//       #
//    #  #  #
// #  #  #  #  #
//    #  #  #
//       #

import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = sc.nextInt();
//        n = n /2 +1;
//        for (int i = 1; i <= n; i++) {
//            for(int j=1; j <= n-i; j++){
//                System.out.print("\t");
//            }
//            for(int j=1; j <= i; j++){
//                System.out.print("*\t");
//            }
//
//            for(int j=1; j < i; j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//        for (int i = n-1; i >=1 ; i--) {
//            for(int j = 1; j <= n-i; j++ ){
//                System.out.print("\t");
//            }
//            for(int j=1; j <= i; j++){
//                System.out.print("*\t");
//            }
//            for(int j=1; j < i; j++){
//                System.out.print("*\t");
//            }
//
//            System.out.println();
//        }

//        New approch
        int sp = n/2;
        int st = 1;
        for(int i=1; i<= n; i++){
            for(int j=1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<= st; j++){
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
