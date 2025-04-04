package LeetCode;

import java.util.Arrays;
//their is 2d array of person and their account balance
//find the person with the maximum balance
public class Array2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,15},
            {4,5,6},
            {5,7,0}
        };

        // System.out.println(Arrays.toString(findPerson(arr))); //initial output is [6,15]
        int maxBALANCE = findPerson(arr);
        System.out.println(maxBALANCE);
    }

    static int findPerson(int[][] arr){
        int[] sum = new int[arr.length];
        for(int i=0; i < arr.length ; i++){
            
            for(int j=0;j<arr[i].length ; j++){
                sum[i] += arr[i][j];
            }
            
        }
        System.out.println(Arrays.toString(sum));
        int personAcc = findMax(sum);
        return personAcc;
       
    }

    static int findMax(int[] array){
        int max = array[0];
        int answer = -1 ;
        for(int i=0 ; i < array.length ; i++){
            if(array[i] >= max){
                max = array[i];
                answer= i ;
            }
        }
        return answer;
        
    }
}
