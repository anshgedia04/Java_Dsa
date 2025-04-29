package oop.Priciples.polymorphism.two;
//second type of polymorphism = run time in which name of method , arguments , return type every thing is same only body is diff.

//ex. parent p1 = new child();
//     refernce_varible v1 = new object();

//what varible can access is dependent on ref. varible if ref. variable do not have access of it. it will give error ex. shape do not have area();
//and which method to be called is depencent on object ;
public class main {
    public static void main(String[] args) {
        shape s1=new shape();
        s1.area(); //we are in shape
        square s2=new square();
        s2.area();//square area

        shape s3= new square();
        s3.area(); //square area
    }
}
