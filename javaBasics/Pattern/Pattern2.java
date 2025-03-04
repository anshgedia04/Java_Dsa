package Pattern;
// * 
// * * 
// * * * 
// * * * * 
public class Pattern2 {
    public static void main(String[] args) {
        int N = 4;
        for(int row = 1; row <= N;row++){
            for(int col = 1;col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
