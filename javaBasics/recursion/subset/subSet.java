package recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
     int[] arr = {1,2,3};
     
     List<List<Integer>> result = getSubsets(arr);
     for (List<Integer> subset : result) {
        System.out.println(subset);
    } 
    }

    static List<List<Integer>> getSubsets(int[] arr){
        List<List<Integer>> allSubsets = new ArrayList<>();
        allSubsets.add(new ArrayList<>());

        for(int i = 0; i < arr.length ; i++){
            int num = arr[i];
            List<List<Integer>> newsets = new ArrayList<>();

            for(int j=0; j < allSubsets.size() ; j++){
                List<Integer> newset = new ArrayList<>(allSubsets.get(j));
                newset.add(num);

                newsets.add(newset);
            }

            for(int k=0; k < newsets.size() ; k++){
                allSubsets.add(newsets.get(k));
            }
        }
        return allSubsets;
    }
}
