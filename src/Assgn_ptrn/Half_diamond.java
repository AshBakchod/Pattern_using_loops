package Assgn_ptrn;
import java.util.Scanner;
public class Half_diamond {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n = 2;

        if(N>=0 && N<=50){

            System.out.println("*");

            while(n<=N+1){
                int i = 1;
                int p = 1;
                int j  = 2;

                System.out.print("*");

                while(i<=2*n-3){

                if(p<=n-1){
                    System.out.print(p);
                }else if (p>n-1){
                    System.out.print(p-j);
                    j=j+2;
                }
                i++;
                p++;
                }
                System.out.println("*");
             n++;

            }
            while(n>N+1 && n<2*N+1){
                int i =1;
                int p = 1;
                int j = 2;

                System.out.print("*");

                while(i<=4*N-2*n+1) {

                    if(p<=2*N+1-n){
                        System.out.print(p);
                    }else if (p>2*N+1-n){
                        System.out.print(p-j);
                        j=j+2;
                    }
                    i++;
                    p++;

                }
                n++;
                System.out.println("*");
            }
        }
        System.out.print("*");
    }
}

