package BinarySearch_3;

import java.util.Arrays;

public class binarySearch_2_2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };

        int[] res = findIndex(arr, 13);
        System.out.println(Arrays.toString(res));
    }
    static int[] findIndex(int[][] arr , int target){
        int row = 0 ;
        int col = arr.length -1;
        while (row <= arr.length && col >=0 ) {
            if (arr[row][col] == target) {
                return new int[]{row , col};
            }
            if (arr[row][col] > target) {
                col--;
            }
            else{
                row++ ;
            }
        }
        return new int[]{-1,-1};
    }
}
