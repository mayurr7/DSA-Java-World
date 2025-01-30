package LinkedList.DoublyLL;

import Strings.numOfStrings1967;

public class createDLL {

    public static class Node {
            int val;
            Node next;
            Node prev;

            public  Node(int val){
                this.val = val;
                this.next = null;
                this.prev = null;
            }
        
    }

    public static void print(Node head){
        Node curr =  head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void printReverse(Node tail){
        Node curr =  tail;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = null;

        print(a);
        printReverse(f);


    }
}
