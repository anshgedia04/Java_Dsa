package oop.Priciples.inheritance.Clone;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ansh = new Human(12,"john");

        Human ansh2 = new Human(ansh);

        Human ansh3 = (Human)ansh.clone();
        System.out.println(ansh3.name);
    }
}
