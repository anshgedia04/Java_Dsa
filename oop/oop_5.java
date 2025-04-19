package oop;

class Student3{
    int age ;
    String name;
    Student3(int age , String name){
        this.age = age;
        this.name = name ;
    }

    void greetings(){
        System.out.println("my name is " + this.name + " and age = " + this.age);
    }
}

public class oop_5 {
    public static void main(String[] args) {
        Student3 kunal = new Student3(21 , "john doe");
        kunal.greetings();
    }
}
