package Base;
import java.util.Scanner;

public class loops_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("enter number");
        // int n = in.nextInt();

        // for(int i = 0 ; i <= n ; i++){
        //     System.out.println(i);
        // }

        // int i = 0;
        // while (i<=n) {
        //     System.out.println(i);
        //     i++;
        // }

        // int b = 0;
        // do {
        //     System.out.println(b);
        //     b++;
        // } while (b<=n);


        //prac find max num ; 
        System.out.println("enter a : ");
        int a = in.nextInt() ;
        System.out.println("enter b : ");
        int b = in.nextInt() ;
        System.out.println("enter c : ");
        int c = in.nextInt() ;

        int max = a ;
        if(b>max) {
            System.out.println("b is max");
        }
        else{
            System.out.println(" c is max ");
        }
    }
}
