package recursion;

public class QuickSortExample {
    //quick sort using recursion
    
    public static void quickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivotIndex = partition(arr, st, end);

            quickSort(arr, st, pivotIndex - 1);   // Sort left part
            quickSort(arr, pivotIndex + 1, end);  // Sort right part
        }
    }

    private static int partition(int[] arr, int st, int end) {
        int pivot = arr[end];
        int idx = st - 1;

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                // Swap arr[idx] and arr[j]
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }

        // Final pivot placement
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
