package oop.Priciples.inheritance.two;

public class Boxweight extends Box {
    int weight;

    Boxweight(){
        this.weight = -1;
    }

    public Boxweight(int l, int h, int w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
