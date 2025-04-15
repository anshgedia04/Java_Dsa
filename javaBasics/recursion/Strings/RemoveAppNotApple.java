package recursion.Strings;

public class RemoveAppNotApple {
    public static void main(String[] args) {
        RemoveAppNotApple("" , "mainappl");
    }
    static void RemoveAppNotApple(String updated_str , String main_str){
        if (main_str.length() == 0) {
            System.out.println(updated_str);
            return ;
        }
        char ch = main_str.charAt(0);

        if (main_str.startsWith("app") && !main_str.startsWith("apple")) {
            RemoveAppNotApple(updated_str , main_str.substring(3));
        }
        else{
            RemoveAppNotApple(updated_str + ch , main_str.substring(1));
        }
    }
}
