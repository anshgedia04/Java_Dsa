package oop.static_folder;

public class Employee {

    // Static variable
    static String companyName = "TechCorp";

    // Instance variable
    String employeeName;

    // Constructor
    public Employee(String name) {
        this.employeeName = name;
    }

    // Static method
    static void printCompanyName() {
        System.out.println("Company: " + companyName);
    }

    // Instance method
    void printEmployeeDetails() {
        System.out.println("Employee: " + employeeName + ", Company: " + companyName);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        Employee emp2 = new Employee("Bob");

        // Calling static method without object
        Employee.printCompanyName();

        // Calling instance method with object
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
    }
}
