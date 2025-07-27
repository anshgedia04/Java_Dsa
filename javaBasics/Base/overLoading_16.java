package Base;
import java.util.Arrays;

public class overLoading_16 {
    // method overloading is when two or more methods have the same name but different parameters
    public static void main(String[] args) {
        fun(23); // output : first one
        fun("kunal"); // output : second one

        int ans = sum(23,45);
        System.out.println(ans); // output : 68

        int ans2 = sum(23,45,67);
        System.out.println(ans2); // output : 135

        sum(23,45,67,89,100); // output : [23, 45, 67, 89, 100]
        sum("kunal","kushal","rohan"); // output : [ abc , kushal, rohan]
    }
    
    static void fun(int a){
        System.out.println("first one");
    }
    static void fun(String name){
        System.out.println("second one");
    }

    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a , int b , int c){
        return a+b+c;
    }

    static void sum(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void sum(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
