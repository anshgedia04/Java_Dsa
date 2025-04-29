package oop.Priciples.polymorphism.three;
//static methods can inherited but not override
//bcz static stuff is not a object dependent so that it only access reference var stuff
public class main {
    public static void main(String[] args) {
        Vehicle nissan = new player();
//        nissan.wish(); i am wish

        player p1 = new player();
//        p1.wish(); i am player
    }
}
