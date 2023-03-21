package Theory;
import java.util.Scanner;
public class Alpha_pattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n = 1;
        int i = 1;
        char c = 'A';

        if(N>=0 && N<=26){

            while(n<=N){
                i=1;
                while(i<=n){
                    char p = (char)(c+n-1);
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
