package oop;

class match {
    final int a= 10; // when final is used then variable have to declared  XX final int a is not right;

}
final class Demo {
    final int mark = 10 ;
    String name ;
    
    Demo(String name , int mark){
        // this.mark = mark ; //mark is final so we cant change it....
        this.name = name ;
    }
    void greetings(){
        System.out.println("name:" + this.name + "marks is : " + this.mark);
    }
}

public class oop_7 {
    
    public static void main(String[] args) {
        final int a = 10 ;
        // a= 10 ;  a can not be modified 

       final Integer b ;

       int c = 10;
       int d= 20 ;

       swap(c, d);

       System.out.println(c + " " + d); // nums are not swapping becz in java their is pass by value for primitivs ;
    

       //what if we use objects 

       Integer e = 10 ;
       Integer f = 23 ;

       swap(e, f);

       System.out.println(e + " " + f); // nums are not swapping becz of final keyword  //click on integer;
    
        final Demo d1 = new Demo( "asu", 10) ;
        // d1 = new Demo("kom", 10); // cant change due to final
    }

    static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp ;
    }
}
