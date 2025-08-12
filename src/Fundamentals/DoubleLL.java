package Fundamentals;

public class DoubleLL {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
    public DoubleLL(int value) {
        Node newDll = new Node(value);
        head = newDll;
        tail = newDll;
        length = 1;
    }

    public void printDLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

        public void getHead() {
            System.out.println("head : " + head.value);
        }

        public void getTail() {
        System.out.println("tail : " + tail.value);
        }

        public void getLength() {
        System.out.println("length : " + length);
        }

        public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
          //  length++;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
          //  length++;
        }
        length++;
        }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        }else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        }else {
            head = temp.next;
            head.prev = null;
            temp.next = null;
              }
        length--;
        return temp;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null;
        Node temp = head;
        if(index  < length / 2) {
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = tail.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        Node newNode = new Node(value);
        if(index == 0){
            prepend(value);
            return true;
        }else if(index == length){
            append(value);
            return true;
        }else {
            Node before = get(index - 1);
            Node after = before.next;
            newNode.next = after;
            newNode.prev = before;
            before.next = newNode;
            after.prev = newNode;
            length++;
        }

            return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = null;
        temp.next = null;
        length--;
        return temp;
    }


}
