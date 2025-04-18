package OOP.base;

class Student {
 int Rno;
String name ;
float marks ;
}

public class first {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.Rno  = 2;
        s1.name = "john";
        s1.marks = 13.22f ;

        System.out.println(s1);
        System.out.println(s1.Rno);
        System.out.println(s1.marks);
        System.out.println(s1.name);
    }
}
