package oop.static_folder;

public class human {
    int age;
    int height;
    String name;
    static int population;

    public human(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
        human.population += 1;
    }
}
