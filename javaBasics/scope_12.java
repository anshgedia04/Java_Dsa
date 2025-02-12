public class scope_12 {
    public static void main(String[] args) {
        int a = 10 ;

        {
            // int a  =  20 ; // can not re declare the variable 
            a = 20 ;
            System.out.println(a); // output will be 20 

            int c = 30 ;
            System.out.println(c); // output will be 30 
        }
        System.out.println(a); // output will be 20 

        int c = 40 ;
        System.out.println(c); // output will be 40 
    }
}
