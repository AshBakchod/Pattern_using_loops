import java.util.Scanner;
public class random {
    public static void main(String[] args){
        Scanner s= new Scanner (System.in);
        int N = s.nextInt();
        int n = 1;

        if(N>=0 && N<=50){

            while(n<=N){

                if(n==1 || n==N){
                    int i = 1;

                    while(i<=N){
                    System.out.print("* ");
                    i++;
                    }
                    System.out.println();

                }else {
                    System.out.print("*");
                    int j = 1;
                    while(j<=2*N-3){
                        System.out.print(" ");
                        j++;
                    }
                    System.out.println("*");

                }
                n++;

            }


        }
    }
}
