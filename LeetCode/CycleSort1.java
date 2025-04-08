package LeetCode;

import java.util.Arrays;

public class CycleSort1 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2}; // Example input
        int num = cycleSort(arr);
        System.out.println("Missing number: " + num);
    }

    static int cycleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ) {
            int correctIndex = arr[i]; 

            
            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++; 
            }
        }

        // Find the missing number
        return checkMissingNum(arr);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int checkMissingNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i; // Missing number found
            }
        }
        return arr.length; // If all are present, missing number is `N`
    }
}
