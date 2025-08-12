package recursion.recursion;

public class Recursion {
    private static void method3(){
        System.out.println("Three");
    }

    private static void method2(){
        method3();
        System.out.println("Two");
    }

    private static void method1(){
        method2();
        System.out.println("One");
    }

    public static void main(String[] args) {
        method1();
    }
}
