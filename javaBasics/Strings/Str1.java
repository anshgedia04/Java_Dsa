package Strings;

public class Str1 {
    public static void main(String[] args) {
        String one = "Hello";
        System.out.println(one);//output : Hello

        System.out.println(one.length());//output : 5

        String two = "answer";
        String three = "answer";
        System.out.println(two == three);//output : true //because both are pointing to same memory location
        System.out.println(two.equals(three));//output : true //because both are pointing to same memory location
    }
}
