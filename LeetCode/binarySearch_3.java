package LeetCode;
//find an element's index in sorted infinite array
public class binarySearch_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12};
        int res = findIndex(arr,12);
        System.out.println(res);
    }
    static int findIndex(int[] arr,int target){
        int start = 0 ;
        int end = 1;
        int index= -1 ;

        while (true) {
            try{
                if (arr[end] >= target) {
                    break ;
                }
                start = end + 1;
                end = start*2;
                System.out.println(start + " " + end);
            }
            catch(ArrayIndexOutOfBoundsException e){
                break ;
            }

        }
        while (start <= end) {
                int mid = (start + end) /2 ;
                try {
                    if(target == arr[mid]){
                        return mid;
                    }
                    else if(target < arr[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    end = mid - 1 ; 
                }
            }
        return index ; 
    }
}
