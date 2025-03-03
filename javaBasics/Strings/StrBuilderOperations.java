package Strings;

public class StrBuilderOperations {
    public static void main(String[] args) {
                // Creating a StringBuilder object
                StringBuilder sb = new StringBuilder("Hello");
                System.out.println("Initial String: " + sb); // Hello
        
                // Append operation
                sb.append(" World");
                System.out.println("After append: " + sb); // Hello World
        
                // Insert operation
                sb.insert(5, " Java");
                System.out.println("After insert: " + sb); // Hello Java World
        
                // Replace operation
                sb.replace(6, 10, "C++");
                System.out.println("After replace: " + sb); // Hello C++ World
        
                // Delete operation
                sb.delete(5, 9);
                System.out.println("After delete: " + sb); // Hello World
        
                // Reverse operation
                sb.reverse();
                System.out.println("After reverse: " + sb); // dlroW olleH
        
                // Length and Capacity
                System.out.println("Length: " + sb.length()); // 11
                System.out.println("Capacity: " + sb.capacity()); // Default is 16 + initial length
        
                // Set character at index
                sb.setCharAt(0, 'D');
                System.out.println("After setCharAt: " + sb); // DlroW olleH
        
                // Convert StringBuilder to String
                String finalString = sb.toString();
                System.out.println("Final String: " + finalString); // DlroW olleH
    }
}
