package Strings;

import java.util.Scanner;

public class revSTR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);


        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }


    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;


            left++;
            right--;
        }

        return new String(charArray);
    }
}

