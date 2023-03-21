package Theory;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n=1;
        int i=1;

        if(N>=0 && N<=50){
            while(n<=N){
                i=1;
                while(i<=n){
                    if(i<n){
                        int p = n-i+1;
                        System.out.print(p);
                    }else if (i==n){
                        System.out.println(1);
                    }
                    i=i+1;
                }
                n=n+1;
            }
        }

    }
}
