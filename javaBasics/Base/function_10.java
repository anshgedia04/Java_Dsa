package Base;
import java.util.Scanner;

public class function_10 {
    public static void main(String[] args) {
        sum();  //function with no return type and no  args....;

        // sum2(10, 20); // function with non return type and with args...;

        // int result = sum3(10, 20); // function with return type and with args...;
        // System.out.println(result);
    }
    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static void sum2(int a , int b){
        int sum = a + b ;
        System.out.println(sum);
    }

    static int sum3(int a , int b){
        int sum = a + b ;
        return sum;
    }
}
