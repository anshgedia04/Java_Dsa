package OOP.base;

// This class defines an Employee
class Employee {
    
    // This is a default constructor.
    // ✔ It has the same name as the class.
    // ✔ It does NOT take any parameters.
    // ✔ It is automatically called when an object is created.
    Employee() {
        System.out.println("this is default cons"); // Output line for demonstration
    }
}

// This is the main class with the main method (entry point of the program)
public class second {
    public static void main(String[] args) {

        // Creating an object of Employee class
        // 🔔 This will automatically call the default constructor
        Employee e1 = new Employee();
    }
}
