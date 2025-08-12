package leetCode.top150IQ.QN202HappyNumber;

public class Solution {
    public static boolean isHappy(int n){
        int slow = next(n);
        int fast = next(next(n));
        while(slow != fast){
            if(fast == 1) return true;
            slow = next(slow);
            fast = next(next(fast));
        }
        return slow == 1;
    }

    private static int next(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(7));
    }
}
