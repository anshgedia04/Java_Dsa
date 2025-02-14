package Array_2;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearchTwoD_9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                System.out.println("Enter the element at position " +i+ " " +j+ " : ");
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

        int target = 6;
        int[] ans = search(arr , target);
        System.out.println(Arrays.toString(ans));

        //find max element in 2d array
        int result = max(arr);
        System.out.println(result);
    }
    static int[] search(int[][] arr  , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j= 0 ; j < arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = arr[0][0];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
