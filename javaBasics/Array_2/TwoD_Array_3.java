package Array_2;

import java.util.Scanner;

public class TwoD_Array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        }; 
        //declare 2d array
        int[][] arr = new int[3][3];  
        //for row 
        for(int row= 0 ; row < arr.length ; row++){
            //for col
            for(int col = 0 ; col<arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //print 2d array
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}
