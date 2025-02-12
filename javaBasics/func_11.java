import java.util.Arrays;

public class func_11 {
    public static void main(String[] args) {
        //lets swap the nums ;
        // int a = 10 ;
        // int b = 20 ;
        // swapNums(a,b);
        // System.out.println("actual values after swap : "+ a + " " + b); //output will 10 20 //not swapped
        // //the reason is that the in primitive data types the copy of the values is passed and not the referece passed 

        int[] arr = {1,2,3,4,5};
        changeArr(arr);
        System.out.println(Arrays.toString(arr)); //output will [99, 2, 3, 4, 5] 
        //the reason is that the in reference data types the reference of the values is passed and not the copy of the values passed 
    }
    // static void swapNums(int a , int b){
    //     int temp = a ;
    //     a = b ;
    //     b = temp ;
    //     System.out.println(a + " " + b);
    // }

    static void changeArr(int[] arr){
        arr[0]=99;
    }
}
