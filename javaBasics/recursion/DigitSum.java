package recursion;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sumDigit(15541);
        System.out.println(ans);
    }
    static int sumDigit(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumDigit(n/10);
    }
}
