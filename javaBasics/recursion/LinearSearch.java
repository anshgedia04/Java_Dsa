package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5,12,6,7,33};
        int ans = search(arr, 0, 35) ;
        System.out.println(ans);
    }
    static int search(int[] arr , int index , int target){
        if (arr[index] == target) {
            return index;
        }
        if (index == arr.length - 1) {
            return -1 ;
        }
        return search(arr, index + 1, target);
    }
}
