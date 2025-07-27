// package Strings;

// public class REV {
//     public static void main(String[] args) {
//         String str = "heheh";
//         Boolean isPalindrom = isPalindrome(str);
//         System.out.println(isPalindrom);
//     }
//     public static Boolean isPalindrome(String str){
//         String s1 = str;
//         String s2 = reverseString(str);
//         if(s1.equals(s2)){
//             return true;
//         }
//         return false;
//     }

//     static String reverseString(String str){
//         char[] charArray = str.toCharArray();
//         int left = 0, right = charArray.length - 1;

//         while (left < right) {
//             char temp = charArray[left];
//             charArray[left] = charArray[right];
//             charArray[right] = temp;

//             left++;
//             right--;
//         }

//         return new String(charArray);
//     }
// }
