package LeetCode;
//find peak element from mountain array
public class binarySearch_4 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,6,4,2,0};
        int res = peakMountain(arr);
        System.out.println(res);
        
    }
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
}
