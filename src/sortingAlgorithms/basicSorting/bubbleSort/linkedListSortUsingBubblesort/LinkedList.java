package sortingAlgorithms.basicSorting.bubbleSort.linkedListSortUsingBubblesort;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    void bubbleSort(){
        if(this.length < 2) return;
        Node sortUntil = null;
        while(sortUntil != this.head.next){
            Node current = this.head;
            while(current.next != sortUntil){
                if(current.value > current.next.value){
                    int temp = current.value;
                    current.value = current.next.value;
                    current.next.value= temp;
                }
                current = current.next;
            }
            sortUntil = current;
        }
    }

}

