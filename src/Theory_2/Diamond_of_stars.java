package Theory_2;
import java.util.Scanner;
public class Diamond_of_stars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
if(N%2 == 0){
    return;
}else{
        if ( N>=0 &&  N <= 49) {
            int n = 1;
            while (n<=(N+1)/2){
                int i = 1;
                while(i<=(N+1)/2 - n){
                    System.out.print(" ");
                    i++;
                }
                 i = 1;
                while(i<=2*n-1){
                    System.out.print("*");
                    i++;
                }
                 n++;
                 System.out.println("");
            }
            while(n>(N+1)/2 && n<=N){
                int j = 1;

                while(j<=(n-(N+1)/2)){
                    System.out.print(" ");
                    j++;
                }
                j=1;
                while(j<=(2*N-2*n+1)){
                    System.out.print("*");
                    j++;
                }
                n++;
                System.out.println("");
            }
        }
    }
}}

