package heap.heap;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        myHeap.insert(92);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(50);
        myHeap.insert(91);
        myHeap.insert(77);
     //   System.out.println(myHeap.getHeap());
        myHeap.insert(100);
 //       System.out.println(myHeap.getHeap());
        myHeap.insert(65);
       myHeap.remove();
        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());
        myHeap.remove();
        System.out.println(myHeap.getHeap());
    }
}
