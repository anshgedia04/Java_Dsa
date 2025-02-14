package LeetCode;
//their is a array of integers.
//return the number of count of even digits in the array.
public class Array1 {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int result = CountEvenDigits(arr);
        System.out.println(result);
    }
    static int CountEvenDigits(int[] arr){
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(IsEvenDigits(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean IsEvenDigits(int num){
        int count = 0 ;
        while(num > 0){
            count++;
            num = num / 10;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }
}