package oop.Priciples.inheritance;

public class square extends measures{
    square(){

        int l =super.length;
        int result = l*l;
        System.out.println(result);
    }
//
//    void print(){
//        System.out.println(super.length);
//        int side = super.length;
//        System.out.println(side*side);
//    }
}
