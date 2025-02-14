package Array_2;

public class max_7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //finding max value in the array
        System.out.println(findMAX(arr));

        //finding max value in the range of the array
        System.out.println(findMAXRange(arr , 0 , 3));
    }
    static int findMAX(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findMAXRange(int[] arr , int start , int end){
        if(arr.length == 0){
            return -1;
        }

        int max = arr[start];
        for(int i = start ; i <= end ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}