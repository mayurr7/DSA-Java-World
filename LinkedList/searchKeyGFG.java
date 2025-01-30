package LinkedList;

public class searchKeyGFG {

    static class Node {
        int data;
        Node next; 

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
        
    }

    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node current = head;
        while(current != null){
            if(current.data == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    static void printLL(Node head){
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data);
            if (currNode.next != null) {
                System.out.print("-");
                
            }
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node hNode = new Node(1);
        hNode.next = new Node(2);
        hNode.next.next = new Node(3);
        hNode.next.next.next = new Node(4);
        hNode.next.next.next.next = new Node(5);

        printLL(hNode);
        System.out.println(searchKey(5, hNode, 30));
    }


}
