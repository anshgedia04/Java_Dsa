package Base;
import java.util.Scanner;

public class fibbo_8 {
    public static void main(String[] args) {
    //     int a  = 0;
    //     int b = 1;
    //     int n = 7;
    //   int  count = 2;
    //     while (count <= n) {
    //         int temp = b;
    //         b = b+a;
    //         a = temp;  //print nth element in fibbonacci
    //         count++;
    //     }
    //     System.out.println(b);

        Scanner in = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = in.nextInt();
        int x = 0 ;
        int y = 1;
    
        for(int i = 2 ; i <= num ; i++){
            int temp = y ;
            y = y + x ;
            x = temp ;
            System.out.print(y + " ");
        }
    }
}
