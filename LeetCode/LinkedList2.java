package LeetCode;

public class LinkedList2 {
    public static void main(String[] args) {

    }
    private static boolean isHappy(int n) {
        int slow = n ;
        int fast = n ;
        do {
            slow = findSquareDigits(slow);
            fast = findSquareDigits(findSquareDigits(fast));

        }while (fast != slow);

        if(slow == 1){
            return ;
        }
        return false;
    }

    private static int findSquareDigits(int n) {
        int answer = 0;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            answer += rem * rem;
        }
        return answer;
    }
}//
