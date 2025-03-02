package Strings;

public class Str5Palindrom {
    public static void main(String[] args) {
        String s1 = "abcba";
        boolean Palindrom = CheckPalindrom(s1);
        System.out.println(Palindrom);
    }
    static boolean CheckPalindrom(String str){
        String s1 = str ;
        for (int i = 0; i < s1.length(); i++) {
            int Start = i;
            int end = s1.length() - i - 1;
            if(s1.charAt(Start) != s1.charAt(end)) {
                return false;
            }
            if (Start > end) {
                break;
            }
        }
        return true;
    }
}
