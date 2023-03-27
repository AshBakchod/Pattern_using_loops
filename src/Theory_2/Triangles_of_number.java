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
               int spaces = 1;
               while(spaces <= (N-n)){
                   System.out.print(" ");
                   spaces++;
               }
               int j = 1;
               int p = n;
               while(j<=n){
                   System.out.print(p);
                   p++;
                   j++;
               }
               j=1;
               p=2*n-2;
               while(j<=n-1){
                   System.out.print(p);
                   p--;
                   j++;
               }
               System.out.println("");
               n++;
            }
        }
    }
}
