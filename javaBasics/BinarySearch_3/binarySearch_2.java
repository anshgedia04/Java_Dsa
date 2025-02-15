package BinarySearch_3;
//ceiling of a target number is the smallest number which is greater than or equal to the target number
//example: arr={1,2,3,4,5,7,8,9} and target=6 then ceiling is 7
public class binarySearch_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9};
        int res = Celing(arr , 6);
        System.out.println(res);
    }
    static int Celing(int[] arr , int target){
        int start = 0 ;
        int end= arr.length - 1;

        while(start <= end ){
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
        return start;
    }
}
