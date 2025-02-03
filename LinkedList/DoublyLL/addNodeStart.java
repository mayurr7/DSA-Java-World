package LinkedList.DoublyLL;

public class addNodeStart {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }

    static Node addNodeAtStart(Node head, int x) {
      
        Node newNode = new Node(x);
        if (head == null) {
           
          return newNode;
        }     

           
        newNode.next = head;
        head.prev = newNode;
         return newNode;

    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(4);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = null;

        print(a);
        Node node = addNodeAtStart(a, 55);
        print(node);
        

    }
}
