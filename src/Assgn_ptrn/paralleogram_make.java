package Assgn_ptrn;

import java.util.Scanner;

public class paralleogram_make {
    public static void main(System[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        if (N>=0 && N <=50){

            int n = 1;

            while(n<=N){

                int i = 1;

                while(i<=n-1){
                    System.out.print(" ");
                    i++;
                }
                while(i<=N+n-1){
                    System.out.print("*");
                    i++;
                }
                n++;
                System.out.println();
            }


        }
    }
}
