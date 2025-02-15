package BinarySearch_3;

public class bs1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int indexSearched = BinarySearch(arr, 2);
        System.out.println(indexSearched);

    }
    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end= arr.length - 1 ;

        while(start <= end){
            int mid = (start + end) / 2 ;
            if(arr[mid] == target){
                return mid;
            }
            else if (target < arr[mid]) {
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
