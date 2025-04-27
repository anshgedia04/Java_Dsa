package oop.Priciples.inheritance.four;

public class main {
    public static void main(String[] args) {
        //we can not access child elements from parent
        car c1 = new car(1214,"SUV");
//        System.out.println(c1.company);

        //here company object is created which is referencing to parent car
        car c2 = new company(1215,"XUV" , "nissan");
        //we can not access bcz we can only access those elements as reference varible
//        System.out.println(c2.company);
        System.out.println(c2.typeOfCar);

        //here we got an error bcz c3 is referencing to company and object is created of a parent class
//        company c3 = new car(1215,"mini");

    }
}
