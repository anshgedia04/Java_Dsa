package recursion.Strings;

public class RemoveStr {
    public static void main(String[] args) {
        removeStr("", "anApplew");
    }
    static void removeStr(String updated_str , String main_str){
        if (main_str.length() == 0) {
            System.out.println(updated_str);
            return;
        }
        char ch = main_str.charAt(0);
        if (main_str.startsWith("Apple")) {
            removeStr(updated_str, main_str.substring(5));
        }
        else{
            removeStr(updated_str + ch, main_str.substring(1));
        }
    }
}
