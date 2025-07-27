package LeetCode;

import java.util.Arrays;

public class Array_4 {

    public static void main(String[] args) {
       int[] arr = {11,12,15,18,6,5};
        int swap_count = arr(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(swap_count);
    }
        public static int arr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        int counter = 0;
        while (start <= end) {
            while (checkEVEN(arr[start])) {
                start++;
            }
            while (!checkEVEN(arr[end])) {
                end--;
            }
            swap(arr, start, end);
            counter++;
            start++;
            end--;
        }
        return counter;
    }

   static Boolean checkEVEN(int num){
        if(num%2 == 0){
            return true;
        }
        else{
            return false;
        }
        
    }

   static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }    
}
