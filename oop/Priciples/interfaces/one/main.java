package oop.Priciples.interfaces.one;

public class main {
    public static void main(String[] args) {
        car nissan = new car();
//        nissan.sound();
//        nissan.start();

        brake audi = new car();
        //audi.start(); gives error bcz start not exist in brake

        ExtremeCar tuffan = new ExtremeCar();
        tuffan.Start();

        tuffan.changeCar();

        tuffan.Start();

        tuffan.startMedia();
    }
}
