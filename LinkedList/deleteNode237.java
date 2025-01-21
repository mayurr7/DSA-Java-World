package LinkedList;

public class deleteNode237 {
     class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
        
    }

    public void deleteNode(Node node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }   
   
}
