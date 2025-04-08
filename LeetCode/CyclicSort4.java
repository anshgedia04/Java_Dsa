package LeetCode;
import java.util.Arrays;
//fimding misplaced/mismatched element 
public class CyclicSort4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2, 2};
        int[] mismatch = setMismatch(arr);
        System.out.println("Mismatch elements: " + Arrays.toString(mismatch));
    }

    static int[] setMismatch(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n;) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        return mismatch(arr);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int[] mismatch(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return new int[]{arr[i], i + 1};
            }
        }
        return new int[]{-1, -1}; // No mismatch
    }
}
