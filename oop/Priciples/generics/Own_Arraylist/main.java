package oop.Priciples.generics.Own_Arraylist;

public class main {
    public static void main(String[] args) {
        My_Arraylist list = new My_Arraylist();
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);

        list.printArraylist();

        list.setValue(0,12);
        list.setValue(6,12);

        list.setValue(7,12);
        list.setValue(5,12);

        list.printArraylist();
    }
}
