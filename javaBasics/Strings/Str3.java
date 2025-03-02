package Strings;

public class Str3 {
    public static void main(String[] args) {
        System.out.println('a' + 'b' ); //output 195
        System.out.println("a" + "b" ); //output ab
        System.out.println('a' + "b" ); //output ab

        System.out.println('a' + 3); //output 100
        System.out.println((char)('a' + 3)); //output d
    }
}
