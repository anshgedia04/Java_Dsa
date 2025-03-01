import java.util.Scanner;

public class prime_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ans = isPrime(n);
        System.out.println(ans);
    }

    static String isPrime(int n){
        if (n <= 1) {
            return "not prime";
        }
        for(int i = 2 ; i <= n/2 ; i++){
            if(n%i == 0){
                return "not prime";
            }    
        }
        return "prime" ;
    }
}
