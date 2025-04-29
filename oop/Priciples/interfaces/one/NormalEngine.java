package oop.Priciples.interfaces.one;

public class NormalEngine implements engine{
    public NormalEngine() {
        super();
    }

    @Override
    public void start() {
        System.out.println("start normal engine");
    }

    @Override
    public void stop() {
        System.out.println("stop normal engine");
    }

    @Override
    public void maxSpeed() {
        System.out.println("150kmph");
    }
}
