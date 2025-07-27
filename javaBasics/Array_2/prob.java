package Array_2;

import java.util.Arrays;
//one side even numbers and other side odd numbers
public class prob {
    public static void main(String[] args) {
       int[] arr = {11,12,15,18,6,5};
        arr(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void arr(int[] arr){
        int start = 0;
        int end = arr.length-1;

        
        while (start <= end) {
            while (checkEVEN(arr[start])) {
                start++;
            }
            while (!checkEVEN(arr[end])) {
                end--;
            }
            swap(arr, start, end);
            start++;
            end--;
        }
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
