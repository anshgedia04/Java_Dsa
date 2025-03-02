package Strings;

public class Str2 {
    public static void main(String[] args) {
        //preety print the string & other things
        int a = 10 ;
        System.out.printf("num is : %d" , a); //%d is used to print num //output is -> num is : 10

        float b = 10.2648981f;
        System.out.printf("%n" + "num is : %f" , b); //%f is used to print float num //output is -> num is : 10.2648981
        System.out.printf("%n" + "num is : %.2f" , b); //%.2f is used to print float num //output is -> num is : 10.26

        int age = 20;
        String name = "john";
        System.out.printf("%n" + "name is : %s & age is : %d" , name , age);
    }
}   
