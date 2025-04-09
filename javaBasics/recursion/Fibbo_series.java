package recursion;
//print fib series till n
public class Fibbo_series {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int n = 5; // Number of terms to print

        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
