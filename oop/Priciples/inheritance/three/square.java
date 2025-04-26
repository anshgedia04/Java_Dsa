package oop.Priciples.inheritance.three;

public class square extends Shape{
    int area;

    public square(int side) {
        super(side);
        this.area = side*side;
    }

    public int getArea() {
        return area;
    }
}
