package oop;

class one{
    String name ;
    void greetings(){
        System.out.println("my name is " + this.name);
    }
    one(){
        this.name = "kmap";
    }

    void changeName(String name){
        this.name = name ;
    }
}

public class four {
    public static void main(String[] args) {
        one o1 = new one() ;
        o1.greetings(); // output is :  my name is kmap

        o1.changeName("john");
        o1.greetings();
    }
}
