package Base;
import java.util.Scanner;

public class typeConversion_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // we can not give floating point to an int but reverse is true 
        float a = input.nextFloat();  
        // //input = 12 //output = 12.0 if we give int in float type coonversion happerns 
        System.out.println("num : " + a);

        //type casting in which we can convert type accoriding us

        int b = 10 ;
        float c = (float)(b); //converting a int into float 
        System.out.println(c);

        int N = 257 ;  //we are converting a int into byte
        byte d = (byte)(N); //output is 1 bcz limit of byte is 256 // 257 % 256 = 1 
        System.out.println(d);

        float x = 10.2f ;
        int y = (int)(x);
        System.out.println(y);
    }
}
