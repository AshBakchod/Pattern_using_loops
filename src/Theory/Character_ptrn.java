package Theory;
import java.util.Scanner;
public class Character_ptrn {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int n = 1;
        int i = 1;
        char c = 'A';

        if (N>=0 && N<=13){
            while(n<=N) {
                i = 1;
               char p = (char)(c+n-1);
                while (i <= n) {

                    if (i < n) {
                        System.out.print(p);
                    } else if (i == n) {
                        System.out.println(p);
                    }
                    i = i + 1;
                    p = (char)(p+1);

                }

                n = n + 1;
            }



    }
}}
