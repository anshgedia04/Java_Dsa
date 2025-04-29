package oop.Priciples.interfaces.one;

public class car implements brake , engine , media{
    @Override
    public void start() {
        System.out.println("please start ");
    }

    @Override
    public void stop() {
        System.out.println("please stop ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("150kmph");
    }

    @Override
    public void sound() {
        System.out.println("mp3");
    }
}
