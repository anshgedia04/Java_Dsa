package oop.Priciples.inheritance.three;

public class Triangle extends Shape{
    double area ;

    public Triangle(double base, int height) {
        super(base, height);
        this.area = 0.5 * this.height * this.base;
    }
    public double getArea() {
        return area;
    }
}
