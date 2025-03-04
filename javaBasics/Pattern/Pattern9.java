package Pattern;

public class Pattern9 {
// 0 0 0 0 0 0 0 0 0 
// 0 1 1 1 1 1 1 1 0
// 0 1 2 2 2 2 2 1 0
// 0 1 2 3 3 3 2 1 0
// 0 1 2 3 4 3 2 1 0
// 0 1 2 3 3 3 2 1 0
// 0 1 2 2 2 2 2 1 0
// 0 1 1 1 1 1 1 1 0
// 0 0 0 0 0 0 0 0 0
    public static void main(String[] args) {
        int n = 4 ;
        for(int row = 0; row <= 2*n ;row++ ){
            for(int col = 0; col <= 2*n ;col++ ){
                // finding minimum distance
                int left = col;
                int right = 2*n - col;
                int up = row;
                int down = 2*n - row;
                int PrintDigit = Math.min(Math.min(left , right) , Math.min(up,down));

                System.out.print(PrintDigit + " ");
            }
            System.out.println();
        }
        
    }
}
