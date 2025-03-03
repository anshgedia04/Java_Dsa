package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int N = 4;
        for (int row = 1; row <= 2 * N - 1; row++) {
            int totalCols = row > N ?  N - (row - N): row;

            int spacing = N - totalCols ;
            for (int i = 0; i < spacing; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) { 
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
}
