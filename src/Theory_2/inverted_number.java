package Theory_2;
import java.util.Scanner;
public class inverted_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int n = 1;


        if(N>=0 && N<=50){

            while(n<=N) {

                int i = 1;

                while (i <= N) {
                    if (i <= (N - n + 1)) {
                        System.out.print(N - n + 1);
                    } else if (i > (N - n + 1)) {
                        System.out.print(" ");
                    }
                    i++;
                }
                n=n+1;
            System.out.println("");
            }
        }
    }
}
