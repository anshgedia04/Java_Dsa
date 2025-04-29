package oop.Priciples.polymorphism.one;
//compile time polymorphism --method overloading //name of the method is same but passed argument , type of passed argument is diff also return type is diff
public class overloading {
    void sum(){
        int a= 10;
        int b= 20;
        int c= a+b;
        System.out.println(c);
    }
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        overloading o = new overloading();
        o.sum();

        System.out.println(o.sum(10,20));
        System.out.println(o.sum(10,20,30));
    }
}
