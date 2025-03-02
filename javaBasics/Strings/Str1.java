package Strings;

public class Str1 {
    public static void main(String[] args) {
        String one = "Hello";
        System.out.println(one);//output : Hello

        System.out.println(one.length());//output : 5

        String two = "answer";              //same object is created 
        String three = "answer";
        System.out.println(two == three);//output : true //because both are pointing to same memory location
        System.out.println(two.equals(three));//output : true //Because it checks the value

        //what if we create a different object
        String four = new String("answer");
        System.out.println(two == four);//output : false //because both are pointing to different memory location
        System.out.println(two.equals(four));//output : true //Because it checks the value

        System.out.println(four.charAt(3)); //output : w
    }
}
