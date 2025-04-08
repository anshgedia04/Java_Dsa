package LeetCode;

import java.util.ArrayList;
import java.util.List;
// find all missing numbers from an array using cycle sort
public class CycleSort3 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 1, 2}; // Example input with multiple missing numbers
        List<Integer> missingNumbers = cycleSort(arr);
        System.out.println("Missing numbers: " + missingNumbers);
    }

    static List<Integer> cycleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ) {
            int correctIndex = arr[i]; // The correct position for arr[i]

            // Ensure arr[i] is within range and not already in the correct position
            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++; // Move to the next index only when arr[i] is correctly placed
            }
        }

        // Find all missing numbers
        return findMissingNumbers(arr);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                missingNumbers.add(i); // Missing number found
            }
        }
        return missingNumbers;
    }
}
