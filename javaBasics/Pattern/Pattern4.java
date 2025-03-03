package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        int N = 4;
        for (int row = 1; row <= 2 * N - 1; row++) {
            int totalCols = row > N ? 2 * N - row : row;
            for (int col = 1; col <= totalCols; col++) { 
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
}
