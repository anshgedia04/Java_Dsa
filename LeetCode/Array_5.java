package LeetCode;

import java.util.Arrays;

public class Array_5 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int[] result = two_sum(arr, 9);
        System.out.println(Arrays.toString(result));
    }
    static int[] two_sum(int[] arr , int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start] + arr[end] == target) {
                return new int[]{start,end};
            }
            if(arr[start] + arr[end] > target) {
                end--;
            }else{
                start++;
            }
            
        }
        return new int[]{-1,-1};
    }
}
