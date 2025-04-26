package oop.static_folder;

 class test{
    static String name ;
     test(String name){
        this.name=name;
    }
}

public class question {
    public static void main(String[] args) {
        test name1 = new test("manoj");
        test name2 = new test("karan");

        System.out.println(name1.name); //output will be karan karan
        System.out.println(name2.name);
    }
}
