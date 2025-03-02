package Strings;

public class StrOperstion {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = " Java Programming ";

        // 1. Length of string
        System.out.println("Length: " + str.length()); // 13

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase()); // HELLO, WORLD!

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase()); // hello, world!

        // 4. Character at index
        System.out.println("Char at index 7: " + str.charAt(7)); // W

        // 5. Substring
        System.out.println("Substring (7-12): " + str.substring(7, 12)); // World

        // 6. Replace characters
        System.out.println("Replace 'o' with 'x': " + str.replace('o', 'x')); // Hellx, Wxrld!

        // 7. Check if string contains a sequence
        System.out.println("Contains 'World': " + str.contains("World")); // true

        // 8. Check if string starts with
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // true

        // 9. Check if string ends with
        System.out.println("Ends with 'World!': " + str.endsWith("World!")); // true

        // 10. Trim spaces
        System.out.println("Trimmed: '" + str2.trim() + "'"); // 'Java Programming'

        // 11. Split string
        String[] words = str.split(", ");
        System.out.println("Split result: " + words[0] + " | " + words[1]); // Hello | World!

        // 12. Concatenation
        System.out.println("Concatenation: " + str.concat(str2)); // Hello, World! Java Programming 

        // 13. String equality (case-sensitive)
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!")); // true

        // 14. String equality (ignore case)
        System.out.println("EqualsIgnoreCase 'hello, world!': " + str.equalsIgnoreCase("hello, world!")); // true

        // 15. Convert int to String
        int num = 100;
        System.out.println("Integer to String: " + String.valueOf(num)); // "100"
        
    }
}
