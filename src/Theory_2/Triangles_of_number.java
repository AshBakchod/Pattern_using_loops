package Theory_2;
import java.util.Scanner;
public class Triangles_of_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n =1;
        int i = 1;

        if (N>=0 && N<=50){

            while(n<=N){

                i=1;

                while(i<=(N+n-1)){

                    int p = 0;

                    if (i<=(N-n)){
                        System.out.print(" ");
                    }else if(i>(N-n) && i<N){
                        System.out.print(n+p);
                    }else if (i==N){
                        System.out.print(2*n-1);
                    }
                     else if (i>N && i<(N-n+1)){
                         System.out.print(n-p);}
                     else if (i==(N-n+1)){
                         System.out.println(n);
                    }
                    i++;
                     p++;
                }
             n++;
            }
        }
    }
}
