package recursion.recursion;

 //using recursion
public class Factorial {
    public  static int factorial(int n){
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int myFact = factorial(4);
        System.out.println(myFact);
    }
}



/*
//normal method
public class Factorial{
    public static void main(String[] args) {
        int myFact = 4;
        int result = 1;
        while(myFact >= 1){
            result *= myFact;
            myFact--;
        }
        System.out.println(result);
    }
}

 */
