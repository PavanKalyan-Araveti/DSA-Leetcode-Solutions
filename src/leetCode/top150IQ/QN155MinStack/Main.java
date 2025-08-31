package leetCode.top150IQ.QN155MinStack;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("Min: "+minStack.getMin());
        minStack.pop();
        System.out.println("Top: "+minStack.top());
        System.out.println("Min: "+minStack.getMin());
    }
}
