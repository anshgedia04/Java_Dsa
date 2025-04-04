package BinarySearch_3;

import java.util.Arrays;
// search target in 2d array by linear search
public class binarySearch_2d_array {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int target = 6;
        int[] found = searchMatrix(arr, target);
        System.out.println(Arrays.toString(found));
    }
    static int[] searchMatrix(int[][] arr, int target) {
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}