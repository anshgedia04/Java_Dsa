package LeetCode;

import java.util.Arrays;
//finding the dulplicated number from given array using cyclic sort
public class CycleSort2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2}; // Example input with duplicate '2'
        int duplicated = findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicated);
    }

    static int findDuplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ) {
            int correctIndex = arr[i] - 1; // Correct position of arr[i]

            // If element is not in correct place and not duplicate, swap
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++; // Move to the next index if correctly placed
            }
        }
        System.out.println(Arrays.toString(arr));
        // Find the duplicate
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return arr[i]; // Duplicate found
            }
        }
        return -1; // No duplicate found (shouldn't happen per problem constraints)
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
