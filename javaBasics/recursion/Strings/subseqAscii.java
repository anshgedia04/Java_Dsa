package recursion.Strings;

public class subseqAscii {
    public static void main(String[] args) {
        subseqAscii("", "abc");
    }
    static void subseqAscii(String subSeq_str , String main_str){
        if (main_str.length() == 0) {
            System.out.println(subSeq_str);
            return;
        }
        char ch = main_str.charAt(0);
        subseqAscii(subSeq_str + ch, main_str.substring(1));
        subseqAscii(subSeq_str, main_str.substring(1));
        subseqAscii(subSeq_str + (ch + 0), main_str.substring(1));
    }
}
