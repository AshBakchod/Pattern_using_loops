package Theory;
import java.util.Scanner;
public class Interseting_alphabets {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
     int n = 1;
     int i = 1;

     char c = 'A';

     if (N>=0 && N<=26){
         char p = (char)(c+N);

         while(n<=N){
             i=1;

             p = (char)(c+N-n);

             while(i<=n){

                 p = (char)(c+N-1-n+i);

                 if(i<n){
                     System.out.print(p);

                 }else if(i==n){
                     System.out.println(p);
                 }
                 i=i+1;
             }

             n=n+1;

         }



     }




    }
}
