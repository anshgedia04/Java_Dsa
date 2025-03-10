package recursion;

import java.util.ArrayList;

public class findAllIindex {
    
    public static void main(String[] args) {
        int[] arr = {5,12,6,7,33,7};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = search(arr, 0, 3 , list) ;

        System.out.println(list);
    }
    static ArrayList<Integer> search(int[] arr , int index , int target , ArrayList<Integer> list ){
        if (arr[index] == target) {
            list.add(index);
        }
        if (index == arr.length - 1) {
            if (list.size() == 0) {
                list.add(-1);
            }
            return list ;
        }
        return search(arr, index + 1, target , list);
    }
}
