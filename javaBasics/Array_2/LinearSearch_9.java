package Array_2;

public class LinearSearch_9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        //search for element 4
        int result = searchElement(arr , 4);
        System.out.println("Element found at index: " +result);

        //finding max element in array
        int max = MaxElement(arr);
        System.out.println("Max element in array is: " +max);

        //finding min element in array
        int min = MinElement(arr);
        System.out.println("Min element in array is: " +min);
    }
    static int searchElement(int[] arr , int target){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;  // Return -1 if element not found
    }

    static int MaxElement(int[] arr){
        int max  = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

        static int MinElement(int[] arr){
        int min  = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
