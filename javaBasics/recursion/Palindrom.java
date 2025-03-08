package recursion;

public class Palindrom {
    static int ans = 0;  // Global variable to store reversed number
    
    public static void main(String[] args) {
        int n = 1234;
        reverse(n);
        if (ans == n) {
            System.out.println("yes");   
           }
           else{
            System.out.println("no");
           }
        System.out.println(ans);
    }
    
    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        ans = ans * 10 + rem;
        reverse(n / 10);
        
    }
}
