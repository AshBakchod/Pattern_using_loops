package Theory;
import java.util.Scanner;
public class Triangular_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N= s.nextInt();
        int n = 1;
        int i = 1;

        if (N>=0 && N<=50){

            while(n<=N){

                i=1;
                while(i<=n){

                    if(i<n){
                        System.out.print(n);
                    }else if (i==n){
                        System.out.println(n);
                    }
                    i=i+1;
                }
               n=n+1;
            }
        }

    }
}
