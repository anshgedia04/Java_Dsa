package Pattern;
//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1
public class Pattern8 {
    public static void main(String[] args) {
        int n= 4;
        for (int row = 1; row <= 2*n-1; row++) {
            int totalCols = row > n ? n - (row -n ) : row ;

            int spacing = n - totalCols ;
            for (int i = 0; i < spacing; i++) {
                System.out.print(" ");
            }
            for(int col = totalCols ; col >= 1 ; col--){
                System.out.print(col);
            }
            for(int col = 2 ; col <= totalCols ; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
