package oop;
class Student{
    int age;
    String name;
}
public class first {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 23;
        s1.name = "john";
        System.out.println(s1.age);
    }
}
