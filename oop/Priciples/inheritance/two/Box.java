package oop.Priciples.inheritance.two;

public class Box {
    int l;
    int h;
    int w;

    Box(){
        this.l = 0;
        this.h = 0;
        this.w = 0;

    }

    public Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    //cube
    Box(int side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
}
