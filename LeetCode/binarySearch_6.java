package LeetCode;
//find target in a rotated sorted array
public class binarySearch_6 {
    public static void main(String[] args) {
        //rotated sorted array {5,6,7,0,1,2,3,4} =>
        int[] arr = {4,5,6,7,0,1,2,3};

        int Rotated_peak_element  = findPivot(arr);
        // System.out.println(res);
        int firstHalfElement = findTarget(arr, 2, 0, Rotated_peak_element);
        if (firstHalfElement != -1) {
            System.out.println(firstHalfElement);
        }
        else{
            int res = findTarget(arr, 2, Rotated_peak_element, arr.length);
            System.out.println(res);
        }
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
        return -1;
    }

    static int findTarget(int[] arr ,int target, int in1 , int in2){
        int start = in1;
        int end = in2;
        int ans = -1 ;
        while(start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }   
}
