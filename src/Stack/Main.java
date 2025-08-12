package Stack; // Last in First Out (LIFO)

public class Main {
    public static void main(String[] args) {
        StackExample myStack = new StackExample(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.pop();
        myStack.printStack();
    }
}
