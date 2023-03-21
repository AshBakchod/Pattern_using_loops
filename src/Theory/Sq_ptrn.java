package Theory;
import java.util.Scanner;
public class Sq_ptrn {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int n = 1;
        int i = 1;

        while (n<=N){
            i=1;
            while(i<=N){
                if(i<N){
                    System.out.print(N);
                }else if (i==N){
                    System.out.println(N);
                }
                i=i+1;
            }
            n=n+1;


        }
    }
}
