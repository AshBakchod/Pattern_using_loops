package Theory_2;
import java.util.Scanner;
public class Triangles_of_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n = 1;

        if (N<=50 && N>=0){
            while (n<=N){
               int i=1;

               while(i<=N+n-1){

                   if(i<=N-n){
                       System.out.print(" ");
                   } else if (i>(N-n) && i<=(N)) {
                       int p = n;
                       while(p<=2*n-1){
                        System.out.print(p);
                        p++;
                       }
                   }else if (i>N && i<=(N+n-1)){
                       int j = 2*n-2;
                       while(j>=n){
                           System.out.print(j);
                           j--;
                       }
                   }
                   i++;
               }
               System.out.println("");
               n++;
            }
        }
    }
}
