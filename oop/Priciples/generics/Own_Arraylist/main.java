package oop.Priciples.generics.Own_Arraylist;

public class main {
    public static void main(String[] args) {
        My_Arraylist list = new My_Arraylist();

        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.printArraylist();
        list.remove();
        list.printArraylist();
        list.setValue(2,10);
        list.printArraylist();
    }
}
