package Array_2;

import java.util.Scanner;

public class reverse_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking input
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at index " + i + ":");
            arr[i] = sc.nextInt();
        }

        rev(arr);

        // Printing reversed array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Close Scanner to prevent memory leak
    }  

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void rev(int[] arr) {
        int index1 = 0;
        int index2 = arr.length - 1; // Fix: Correct the last index

        while (index1 < index2) { // Fix: Loop until index1 < index2
            swap(arr, index1, index2);
            index1++;
            index2--;
        }
    }
}
