package LeetCode;
//find the first and last occurence of element's index of an array
import java.util.Arrays;

public class BInarySearch_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,5};

        int[] occurenceINDEX = {-1 , -1};

        int start = findIndex(arr, 4, true);
        int end = findIndex(arr, 4, false);

        occurenceINDEX[0] = start;
        occurenceINDEX[1]= end;

        System.out.println(Arrays.toString(occurenceINDEX));
        
    }
    static int findIndex(int[] arr , int target , boolean isFirstOccurence){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid =( start+end)/2 ;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else{
                if(isFirstOccurence){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    ans = mid;
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
