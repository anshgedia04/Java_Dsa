package oop.Priciples.inheritance.three;

public class Shape {
    int length;
    int width;
    int height;
    double base;

    Shape(){
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.base = 0;
    }

    //rectangle
    Shape(int length , int width){
        this.length = length;
        this.width = width;
    }
    //square
    Shape(int length){
        this.length = length;
    }
    //triangle[

    Shape(double base , int height){
        this.base = base;
        this.height = height;
    }
}
