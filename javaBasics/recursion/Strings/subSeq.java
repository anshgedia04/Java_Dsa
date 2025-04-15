package recursion.Strings;

public class subSeq {
    public static void main(String[] args) {
        subSeq("", "abc");
    }
    static void subSeq(String seq_str , String main_str){
        if (main_str.length() == 0) {
            System.out.println(seq_str);
            return;
        }
        char ch = main_str.charAt(0);
        subSeq(seq_str + ch, main_str.substring(1));
        subSeq(seq_str, main_str.substring(1));
    }
}
