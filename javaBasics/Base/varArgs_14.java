package Base;
import java.util.Arrays;
//variable length arguments when we don't know the number of arguments which is passed to the function
//we can  pass varArgs in last parameter of the function
public class varArgs_14 {
    public static void main(String[] args) {
        func(1,2,3,4,5,6,7,8,9,10);
        func2(1,2,"a","b","c");
    }
    static void func(int ...a){
        System.out.println(Arrays.toString(a));
    }

    static void func2(int a ,int b , String ...c){
        System.out.println(a + " " + b + " " + Arrays.toString(c));
    }
}
