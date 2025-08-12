package leetCode.top150IQ.QN202HappyNumber;

public class SolutionUsing1And7 {
     public static boolean isHappy(int n) {
         if (n == 1 || n == 7) return true;
         while(n > 9){
             int sum = 0;
             while(n > 0){
             sum += (n % 10) * (n % 10);
             n = n / 10;
             }
             if(sum == 1 || sum == 7) return true;
             n = sum;
         }
         return false;
     }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }
}
