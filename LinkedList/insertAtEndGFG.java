package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
    
}

public class insertAtEndGFG {

    public static Node insertAtEnd(Node head, int x) {
        Node newNode =  new Node(x);

        if(head == null){
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    static void printLL(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if(current.next != null){
                System.out.print(" -> ");
               
            }
            current = current.next;
           
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Origanal List :");
        printLL(head);

        head = insertAtEnd(head, 8);
        System.out.println("Updated List");
        printLL(head);
    }

   
}
