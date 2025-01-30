package LinkedList.DoublyLL;

public class arr2DLL {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val= val;
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

   public static Node constructDLL(int arr[]) {
        if(arr.length == 0) return null;

        Node head = new Node(arr[0]);
        head.prev = null;
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr.prev =curr;

            curr = curr.next;
        }
        return head;

        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,0,1,6,5};
        Node head = constructDLL(arr);
        print(head);
    }
}
