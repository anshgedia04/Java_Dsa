package recursion;

public class Fibbo {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int n = 5; // Example: Find the 5th Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
