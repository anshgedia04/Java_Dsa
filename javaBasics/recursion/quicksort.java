package recursion;

import java.util.Arrays;

public class quicksort {
    public static void main(String[] args) {
        int[] arr = {7,2,1,4,5,3};
        quickSort(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int start , int end){
        if(start < end){
            int pivot_index = partition(arr , start , end) ;
            quickSort(arr, start, pivot_index - 1 );
            quickSort(arr, pivot_index + 1, end  );
        }
    }
    static int partition(int[] arr,int start, int end){
        int index = start - 1 ;
        int pivot = arr[end] ; 

        for(int j = start; j < end ; j++){
            if (arr[j] <= pivot) {
                index++;
                int temp = arr[j];
                arr[j] = arr[index];
                arr[index] = temp ;
            }
        }

        index++;
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp ;

        return index ; 
    }
}
