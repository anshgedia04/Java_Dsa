package oop.Priciples.generics.Own_Arraylist.Two;

public class main {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Java");
        System.out.println(strBox.get());

    }
}
