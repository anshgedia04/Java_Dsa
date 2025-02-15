package BinarySearch_3;
//floor of a target number is the greatest number which is smaller than or equal to the target number
//example: arr={1,2,3,4,6,7,8} and target=5 then floor is 4
public class BinarySearch3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        int res = floor(arr, 5);
        System.out.println(res);
    }
    static int floor(int[] arr , int target){
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
        return end;
    }
}
