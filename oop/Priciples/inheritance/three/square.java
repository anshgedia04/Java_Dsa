package oop.Priciples.inheritance.three;

public class square extends Shape{
   double area;

    public square(int length) {
        super(length);
        this.area = Math.pow(this.length , 2);
    }

    public double getArea() {
        return area;
    }
}
