package ass;
import java.util.Scanner;
public class sum_ptrn {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();

        if(N>=0 && N<=50){
            int n =1;
            int sum = 1;

            while(n<=N){

                int i =1;

                while(i<=n){

                 System.out.print(i);

                 if(i<n){
                     System.out.print("+");
                 }
                 i++;
                }

                System.out.print("=");
                System.out.println(sum);

                n=n+1;
                sum = sum + n;
            }
        }

    }






}
