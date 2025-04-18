package oop;

class Student2{
    int age;
    String name ;

    Student2(){
        this.age = 12;
        this.name = "john";
    }
   
}

public class third {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        System.out.println(s1.age);
    }
}
