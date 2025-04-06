package sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // No i++ here, we only increment when the element is correctly placed
            int correctIndex = arr[i] - 1; // The correct position for arr[i]

            if (arr[i] == arr[correctIndex]) { 
                i++; // Move to the next index only when arr[i] is correctly placed

                // if (i+1 == arr[i]) { 
                //     i++; // Move to the next index only when arr[i] is correctly placed
            } else {
                swap(arr, i, correctIndex);

            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
