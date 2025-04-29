package oop.Priciples.interfaces.one;

public class ExtremeCar {
    engine e1;
    media m1= new ExtremeMedia();
    public ExtremeCar() {
        e1 = new ExtremeEngine();
    }

    void Start() {
        e1.start();
    }
    void Stop() {
        e1.stop();
    }

    void changeCar(){
        e1 = new NormalEngine();
    }
    void startMedia(){
        m1.start();
    }
    void stopMedia(){
        m1.stop();
    }

}
