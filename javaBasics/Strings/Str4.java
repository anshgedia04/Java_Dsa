package Strings;

public class Str4 {
    // public static void main(String[] args) {
    //     String series = "";
    //     for(int i = 0 ; i < 26 ; i++){
    //         char ch = (char)('a' + i );
    //         series += ch ; 
    //     }
    //     System.out.println(series); //not a good solution because in every loop we are creating a new object 
    // }
    public static void main(String[] args) {
        StringBuilder S1 = new StringBuilder();
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char)('a' + i );
            S1.append(ch) ; 
        }
        System.out.println(S1); //good solution compare to above solution bcz it is not creating a new object in every loop
    }
}
