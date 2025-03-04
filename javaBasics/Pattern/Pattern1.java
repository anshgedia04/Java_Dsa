package Pattern;
// * * * * 
// * * * * 
// * * * * 
// * * * * 
public class Pattern1 {
    public static void main(String[] args) {
        int N = 4;
        for(int row = 1; row <= N;row++){
            for(int col = 1;col<=N ; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
