package Base.Math; // Ensure correct package structure

public class SqrtCalculator {
    public static void main(String[] args) {
        int number = 50;  // Example number
        int precision = 3; // Decimal places

        double result = findSqrt(number, precision);
        System.out.println("Square root of " + number + " up to " + precision + " decimal places: " + result);
    }

    static double findSqrt(int n, int p) {
        int s = 0, e = n;
        double root = 0.0;

        // Step 1: Binary search to find the integer part of the square root
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m * m == n) {
                return m; // If it's a perfect square, return immediately
            } else if (m * m > n) {
                e = m - 1;
            } else {
                root = m; // Store the best integer approximation
                s = m + 1;
            }
        }

        // Step 2: Refining the result using incremental search for decimal precision
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr; // Step back to the last valid value
            incr /= 10;   // Reduce the increment for finer precision
        }

        return root;
    }
}
