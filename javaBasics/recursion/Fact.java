package recursion;

public class Fact {
    public static void main(String[] args) {
        int fact = facto(15);
        System.out.println(fact);
    }
    static int facto(int n){
        if (n==0) {
            return 1;
        }
        return n * facto(n-1);
    }
}
