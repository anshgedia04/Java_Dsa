package LeetCode;
//find counts of  ratation of an rotated sorted array
//{4,5,6,7,0,1,2,3} => 4

public class binarySearch_7{
    public static void main(String[] args) {
        //rotated sorted array {5,6,7,0,1,2,3,4} =>
        int[] arr = {4,5,6,7,0,1,2,3};

        int Rotated_peak_element  = findPivot(arr);
        int count = Rotated_peak_element + 1;
        System.out.println(count);
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
