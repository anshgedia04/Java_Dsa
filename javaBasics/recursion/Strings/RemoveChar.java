package recursion.Strings;

public class RemoveChar {
    public static void main(String[] args) {
        removeChar("", "ansh");
    }

    static void removeChar(String updated_str , String main_str){
        if (main_str.length() == 0) {
            System.out.println(updated_str);
            return ; 
        }
        char ch = main_str.charAt(0);
        if (ch == 'a') {
            removeChar(updated_str, main_str.substring(1));
        }
        else{
            removeChar(updated_str + ch , main_str);
        }
    }
}
