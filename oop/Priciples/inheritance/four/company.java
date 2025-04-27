package oop.Priciples.inheritance.four;

public class company extends car {
    String company;

    company(int plateNo, String typeOfCar , String company) {
        super(plateNo, typeOfCar);
        this.company = company;
    }
}
