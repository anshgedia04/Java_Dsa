package oop.Priciples.interfaces.one;

public class ExtremeEngine implements engine{

    @Override
    public void start() {
        System.out.println("start turbo engine");
    }

    @Override
    public void stop() {
        System.out.println("stop turbo engine");
    }

    @Override
    public void maxSpeed() {
        System.out.println("250kmph");
    }
}
