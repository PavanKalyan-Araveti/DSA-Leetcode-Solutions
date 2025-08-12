package Trees.dynamicProgramming.fibinocci_BottomUp;

public class fib_BottomUp {
    static int loopRunCount = 0;
    public static int fib(int n){
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;
        for(int index = 2; index <= n; index++){
            loopRunCount++;
            fibList[index] = fibList[index - 1] + fibList[index - 2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fib(n));
        System.out.println("For loop run count: "+loopRunCount);
    }

}
