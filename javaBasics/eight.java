public class eight {
    public static void main(String[] args) {
        //reverce of given number 
        int n = 51517;
        int reverced_num = 0;
        while (n > 0) {
            int rem = n % 10 ;
            reverced_num = (reverced_num*10)+rem ;
            n /= 10;
         
        }
        System.out.println(reverced_num);
       
    }
}
