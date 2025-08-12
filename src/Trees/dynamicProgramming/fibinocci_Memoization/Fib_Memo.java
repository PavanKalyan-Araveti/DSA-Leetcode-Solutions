package Trees.dynamicProgramming.fibinocci_Memoization;
//top to bottom approach
public class Fib_Memo {
    static Integer[] memo = new Integer[100];
    static int methodCalled = 0;
    public static int fib(int n) {
        methodCalled++;
        if (memo[n] != null) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fib(n));
        System.out.println("No of times method called: "+methodCalled);
    }
}
