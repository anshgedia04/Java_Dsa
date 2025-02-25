package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,7,8,6,1,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // static void swap(int[] arr , int Element1 , int Element2){
    //     int temp = arr[Element2];
    //     arr[Element2] = arr[Element1];
    //     arr[Element1] = temp ;
    // }
    static void bubbleSort(int[] arr){
        
        for(int i = 0 ; i < arr.length ; i++){
            for(int j= 1  ; j <= arr.length - i - 1 ; j++ ){
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp ;
                }
            }
        }
    }
}
