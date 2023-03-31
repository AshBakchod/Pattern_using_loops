package ass;
import java.util.Scanner;
public class odd_sq {
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int N = s.nextInt();
       int n =1;

       if (N>=0 && N <=50){

           while(n<=N){

               int i =1;
               int p =2*n-1;

               while(i<=N){

                   if (p<=(2*N-1)) {
                       System.out.print(p);

                   } else if (p>(2*N-1)){
                       p=1;
                       System.out.print(p);

                   }
                   p=p+2;
                   i++;

               }
               n++;
               System.out.println();
           }
       }



    }
}
