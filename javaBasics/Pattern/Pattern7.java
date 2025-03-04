package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        int n= 4;

        for (int row = 1; row <= n; row++) {
            int spacing = n - row ;
            for (int i = 0; i < spacing; i++) {
                System.out.print(" ");
            }
            for(int col = row ; col >= 1 ; col--){
                System.out.print(col);
            }
            for(int col = 2 ; col <= row ; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
