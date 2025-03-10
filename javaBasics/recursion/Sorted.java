package recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,6};
        boolean ans = checkSort(arr, 0);
        System.out.println(ans);
    }
    static boolean checkSort(int[] arr , int index){
        if (index == arr.length - 1) {
            return true ;
        }
        if (arr[index] < arr[index + 1]) {
            return checkSort(arr, index + 1);
        }
        return false ;
    }
}
