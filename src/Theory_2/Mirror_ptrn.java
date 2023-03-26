package Theory_2;
import java.util.Scanner;
public class Mirror_ptrn {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int n = 1;

        if (N>=0  && N<=50){

            while(n<=N) {

                int i = 1;

                while (i <= N - n) {
                    System.out.print(" ");

                    i++;
                }
                i = 1;
                while (i <= n) {
                    System.out.print(i);
                    i++;
                }
                System.out.println("");
                n++;



            }


        }
    }
}
