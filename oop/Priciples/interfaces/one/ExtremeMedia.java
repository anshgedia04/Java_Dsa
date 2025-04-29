package oop.Priciples.interfaces.one;

public class ExtremeMedia implements media{
    @Override
    public void sound() {
        System.out.println("Extreme Media");
    }

    @Override
    public void start() {
        System.out.println("Extreme Media Start");
    }

    @Override
    public void stop() {
        System.out.println("Extreme Media Stop");
    }
}
