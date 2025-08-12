package sortingAlgorithms.basicSorting.insertionSorting.linkedListSortUsingInsertionSort;

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

    void insertionSort(){
        if(this.length < 2) return;
        Node sortedList = this.head;
        Node unsortedList = this.head.next;
        sortedList.next = null;
        while(unsortedList != null){
            Node current = unsortedList;
            unsortedList = unsortedList.next;
            if(current.value < sortedList.value){
                current.next = sortedList;
                sortedList = current;
            }
            else{
                Node searchPointer = sortedList;
                while(searchPointer.next != null && current.value > searchPointer.next.value){
                    searchPointer = searchPointer.next;
                }
                current.next = searchPointer.next;
                searchPointer.next = current;
            }
        }
        head = sortedList;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        tail = temp;
    }

}

