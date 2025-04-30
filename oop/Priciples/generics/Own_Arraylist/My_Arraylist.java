package oop.Priciples.generics.Own_Arraylist;

import java.util.Arrays;

public class My_Arraylist {
    private int[] data ;
    private int DEFAULT_SIZE = 10 ;
    private int size = 0;

    public My_Arraylist() {
        data = new int[DEFAULT_SIZE];
    }

    public void printArraylist(){
        System.out.println("arraylist : " + Arrays.toString(getArraylist()));
    }
    //get arraylist
    private int[] getArraylist(){
        return arrayRange(0 , size);
    }

    private int[] arrayRange(int start, int end) {
        int[] temp = new int[size];
        for (int i = start ; i < end ; i++) {
            temp[i] = data[i];
        }
        return temp;
    }

    //add element
    public void add(int value) {
        if (size == data.length) {
            Prepare_newArray();
        }
        data[size] = value;
        size++;
    }
    //if arraylist is full prepare new Arraylist
    private void Prepare_newArray() {
        int[] temp = new int[data.length * 2];
        for (int i = 0 ; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    //remove last element ;
    public int remove() {
        int removed_element = data[size];
        size--;
        return removed_element;
    }

    //setvalue

    public void setValue(int index, int value) {
        data[index] = value;
        getArraylist();
    }
}
