package oop;

class Emp1 {
    int age ;
    String name ;
    Emp1(int age , String name){
        this.name = name;
        this.age = age;
    }

    Emp1(Emp1 other){
        this.name = other.name;
        this.age = other.age;
    }

    void greetings(){
        System.out.println("my name is " + this.name + " and age = " + this.age);
    }

}

public class oop_6 {
    public static void main(String[] args) {
        Emp1 manoj = new Emp1(12, "manoj");
        // manoj.greetings();  // output : my name is manoj and age = 12

        Emp1 rohan = new Emp1(manoj);
        rohan.greetings();


    }
}
