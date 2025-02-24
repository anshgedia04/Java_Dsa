package BinarySearch_3 ;

public class binary_2d_3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 16;
        searchMatrix(matrix, target);
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0, end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                System.out.println("Element found at index: (" + row + ", " + col + ")");
                return true;
            } else if (midValue < target) {
                start = mid + 1;  // Move right
            } else {
                end = mid - 1; // Move left
            }
        }

        System.out.println("Element not found.");
        return false;
    }
}
