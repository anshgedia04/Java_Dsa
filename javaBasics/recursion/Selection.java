package recursion;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // Sample array
        selectionSort(arr, 0, 0, 0);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int row, int col, int minIndex) {
        if (row >= arr.length - 1) {
            return; // Base case: Sorting is complete
        }

        // Find the minimum index in the remaining array
        if (col < arr.length) {
            if (arr[col] < arr[minIndex]) {
                minIndex = col;
            }
            selectionSort(arr, row, col + 1, minIndex); // Recursive call for column traversal
        } else {
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[row];
            arr[row] = arr[minIndex];
            arr[minIndex] = temp;

            // Move to the next row (next selection step)
            selectionSort(arr, row + 1, row + 1, row + 1);
        }
    }
}
