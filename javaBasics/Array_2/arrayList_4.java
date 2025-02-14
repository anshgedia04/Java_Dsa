package Array_2;
import java.util.ArrayList;
public class arrayList_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //declare array list //when size of the array is not known or fix 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        boolean str = list.contains(3);
        System.out.println(str);

        list.set(0,990);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        System.out.println(list.size());
        
    }
}
