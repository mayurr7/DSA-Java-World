package LinkedList;

import java.util.LinkedList;

public class getCountGFG {
    static class Node{
        int data;
        Node next = null;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }



    public static int getCount(Node head) {
        // code here
        Node temp = head;
        if(head == null){
            return 0;
        }
        int count = 1;
        while (temp.next != null) {
            if(temp.next != null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

    static void printLL(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null){
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head= new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(8);
        // head.next.next.next.next = new Node(7);
        // head.next.next.next.next.next = new Node(5);

        //printLL(head);
        System.out.println(getCount(head));

       
        
    }
}
