package oop.static_folder;

//by usimg static we can access variables and other stuff without creating any object it is class dependent not on object

//why we write always public static void main(String[] args)
// ans : bcz we know that main is the first function that will execute. if we not put stativ over that so that would require
            //object which we cant do .

//we can not use this keyword inside static function bcz this is reference to current object and static is not object depedent
public class static_learn {
    public static void main(String[] args) {
        greet();
    }


// why we write static while declaring functio
//  ans : if we dont write static . we can not use that function inside main method
            //all the functions / methods which is static will not allow to use function/method which is non-static
static void greet(){
        System.out.println("Hello World");
    }

    void greet2(){
        greet();
    }
}
