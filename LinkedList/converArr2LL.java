package LinkedList;

class Node {
    int value;
    Node next;

    Node(int value){
        this.value = value;
        this.next = null;
    }
    
}
public class converArr2LL {
    static Node constructLL(int arr[]) {
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]); 
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

     public static void printLL(Node head){
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if(current.next != null){
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = constructLL(arr);
        printLL(head);
    }
}
