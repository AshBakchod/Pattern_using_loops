package Theory_2;
import java.util.Scanner;
public class star {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N =s.nextInt();
        int n = 1;
        int i =1;

        if (N>=0 && N<=50){

            while(n<=N){

                i=1;

                while(i<=(N+n-1)){

                    if (i<=(N-n)){
                        System.out.print(" ");
                    }else if(i>(N-n) && i<(N+n-1)){
                        System.out.print("*");
                    }else if (i == (N+n-1)){
                        System.out.println("*");
                    }

                    i++;

                }

                n++;
            }
        }

    }
}
