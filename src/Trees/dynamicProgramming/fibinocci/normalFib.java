package Trees.dynamicProgramming.fibinocci;

public class normalFib {
    static int methodCall = 0;
    public static int fib(int n) {
        methodCall++;
        if(n == 0 || n == 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fib(n));
        System.out.println("No of times method called: "+methodCall);
    }
}
