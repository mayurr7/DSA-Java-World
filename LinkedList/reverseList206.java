package LinkedList;

public class reverseList206 {
   static class Node{
    int data;
    Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
   }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev =current;
            current = next;
        } 
        return prev;

    }
    static void printLL(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null){
                System.out.print("-");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head= new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(5);

        printLL(head);
       printLL(reverseList(head));

    }
}
