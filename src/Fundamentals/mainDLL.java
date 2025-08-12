package Fundamentals;

public class mainDLL {
    public static void main(String[] args) {
        DoubleLL myDoubleLL = new DoubleLL(6);
        myDoubleLL.append(7);
        myDoubleLL.prepend(5);

        myDoubleLL.remove(1);


        myDoubleLL.printDLL();

    }
}
