package LinkedList;

import Fundamentals.LinkedList;

public class mainLL {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(33);
        myLinkedList.append(46);
        myLinkedList.append(47);
        myLinkedList.append(48);
        myLinkedList.remove(1);
        myLinkedList.printList();


    }
}
