package Pattern;
//    * 
//   * * 
//  * * * 
// * * * *
public class Pattern6 {
    public static void main(String[] args) {
        int N = 4;
        for(int row = 1; row <= N;row++){
            int spacing = N - row;
            for (int i = 0; i < spacing; i++) {
                System.out.print(" ");
            }
            for(int col = 1;col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
