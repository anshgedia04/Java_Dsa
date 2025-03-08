package recursion;

public class first {
    public static void main(String[] args) {
        printNum(5);
    }
    static void printNum(int n){
        System.out.print(n + " ");
        if (n==1) {
            return ;
        }
        printNum(n-1);
    }

}
