package recursion;
//print nums --
public class Concept {
    public static void main(String[] args) {
        fun(10);
    }
    static void fun(int n){
        if (n==0) {
            return ;
        }
        System.out.println(n);
        // fun(n--); not works infinite recurtion
        fun(--n);
    }
}
