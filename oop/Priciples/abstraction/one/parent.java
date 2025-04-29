package oop.Priciples.abstraction.one;
//abstraction : hiding unwanted data and showing only important info.
//abstract keyword : if any method that you know overrriddern in subclass declare it as abstract
//method : only declare method without body
//if more than one abstract is used inside a class. class have to be a abstract

//we cant create object of abstract classes ex. parent p1= new parent() //gives error
//we cant create abstract constructor bcz cant create a object
//we can create static methods because we can access it without creating object


//abstract classes can  not be final bcz final prevents override and abstract classes have to override
public abstract class parent {

    abstract void career();
    abstract void partner();

//    abstract parent(){ //error
//
//    }

    static void hello(){
        System.out.println("hello");
    }
}
