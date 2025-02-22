package LeetCode;
public class binarySearch_6 {
    public static void main(String[] args) {
        //rotated sorted array {5,6,7,0,1,2,3,4} =>
        int[] arr = {4,5,6,7,0,1,2,3};

        // int res  = findPivot(arr);
        // System.out.println(res);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid+1] && mid < end) {
                return mid ;
            }
            if (arr[mid] < arr[mid-1] && mid > start) {
                return mid-1 ;
            }
            if (arr[mid] < arr[start] ) {
                end = mid ;
            }
            else{
                start = mid+ 1 ;
            }
        }
        return -1 ;
    }
}
