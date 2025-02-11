public class seven_search {
    public static void main(String[] args) {

        //find the repenting number times 
        int n = 4844;
        int search_element = 4 ;
        int count=0 ;
        while (n>0) {
            int rem = n % 10 ;
            if (rem == search_element) {
                count++; 
            }
            n = n/10 ;
        }
        System.out.println(count);
    }
}
