package recursion;
// countZeros
public class countZeros {
    public static void main(String[] args) {
        int n = 3211 ;
        int ans = count(n);
        System.out.println(ans);
    }
    static int count(int n){
        return note(n , 0);
    }

    static int note(int n , int c){
        if (n==0) {
            return c;
        }
        int rem = n%10;
        if (rem == 0) {
          return  note(n/10, c+1);
        }
        else{
            return note(n/10 , c);
        }
    }
}
