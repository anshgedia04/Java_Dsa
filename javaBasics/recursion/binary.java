package recursion;
//binary search....
public class binary {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int mid = search(arr, 9, 0, arr.length-1);
        System.out.println(mid);
    }
    static int search(int[] arr , int target , int start , int end){
        if (start > end) {
            return -1;
        }
        int mid = (start + end)/2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, target, mid+1, end);
        }
        else{
           return search(arr, target, start, mid-1);
        }
        
    }
}
