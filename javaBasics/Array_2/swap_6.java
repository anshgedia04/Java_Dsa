package Array_2;
import java.util.Scanner;
import java.util.Arrays;
public class swap_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("Enter the element at index " + i);
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        swap(arr , 0 , 4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
