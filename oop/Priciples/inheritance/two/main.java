package oop.Priciples.inheritance.two;

public class main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        System.out.println(box1.h + " " + box1.l + " " + box1.w); // 0 0 0
//        Box box2 = new Box(2,2,2);
//        System.out.println(box2.h + " " + box2.l + " " + box2.w); //2 2 2

        Boxweight box3 = new Boxweight(2,3,4,5);
        System.out.println(box3.h + " " + box3.l + " " + box3.weight); // 3 2 5
    }
}
