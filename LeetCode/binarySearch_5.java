package LeetCode;
//question : find element from an moutain array
//example : int[] arr = {1,3,5,7,6,4,2,0};
//target : 0
//output : 7

//target : 3
//output : 1
public class binarySearch_5 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,2,0};
        int peak = peakMountain(arr);
        int firstSearch = firstHalfElement(arr, 0, 0, peak);
        if (firstSearch != -1) {
            System.out.println(firstSearch);
            return ;
        }
        int secondSearch = secondHalfElement(arr, 0, peak+1, arr.length-1);
        if (secondSearch != -1) {
            System.out.println(secondSearch);
            return ;
        }
    }
    //find the peak of the mountain array
    static int peakMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <  end) {
            int mid = (start+end) / 2 ;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start ;
    }
    //search in the first half of the array
    static int firstHalfElement(int[] arr ,int target, int in1 , int in2){
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
    //search in the second half of the array
    static int secondHalfElement(int[] arr ,int target, int in1 , int in2){
        int start = in1;
        int end = in2;
        int ans = -1 ;
        while(start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {  
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}
