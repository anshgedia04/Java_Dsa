package oop.Priciples.generics.Own_Arraylist.Two;

class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

