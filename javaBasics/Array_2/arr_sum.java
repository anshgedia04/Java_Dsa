package Array_2;

import java.util.Scanner;

public class arr_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        scanner.close();
        
        int sum = calculateSum(numbers);
        System.out.println("Sum of all numbers: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
