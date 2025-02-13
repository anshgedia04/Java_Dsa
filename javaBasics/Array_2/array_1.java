package Array_2;
import java.util.Arrays;
public class array_1 {
    //in java array is a collection of similar type of data
    //in java dynamically memory allocation is happens in heap memory or contiguous memory allocation can also be done according to jvm
    //on the other hand in c/c++ continious memory allocation in happen means all the elements are stored in contigious memory location
    
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(Arrays.toString(arr));
        
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));
     }
}
