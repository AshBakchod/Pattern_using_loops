package Theory;
import java.util.Scanner;
public class Basic_pattern1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();

        int n = 1;
        int i = 1;
        while(n<=N){
            i=1;
           while(i<=n) {

               if (i < n) {
                       System.out.print("*");

               } else if (i == n) {
                   System.out.println("*");
               }
           i=i+1;
           }
           n=n+1;
        }


    }
}
