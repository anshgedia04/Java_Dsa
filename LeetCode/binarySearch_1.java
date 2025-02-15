package LeetCode;

public class binarySearch_1 {
    public static void main(String[] args) {
        char[] arr =  {'a' , 'b' , 'c' , 'e'};
        char res = find(arr, 'b');
        System.out.println(res);

    }
    static char find(char[] arr , char target){
        int start = 0 ;
        int end = arr.length - 1 ;

        while (start <= end) {
            int mid = (start+end) / 2 ;
            if (arr[mid] == target) {
                char ch = arr[mid+1];
                return ch;
            }
            else if(start == arr.length){
                return arr[0];
            }
            else if(target > arr[mid]){
                start = mid + 1 ;
            }
            else{
                end = mid - 1;
            }
           
        }
        return arr[start];
    }
}
