class Node {
  
    constructor(data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class solution{

    constructor() {
        this.head = null;
    }

    addNode(head, p, x){
        let newNode = new Node(x);
         
        let curr = head;
        if(curr == null){
            return newNode;
        }
        let count = 0;
        while(curr != null && count < p ){
            curr = curr.next;
            count++;
        }

        newNode.next = curr.next;

        if(curr.next !== null){
            curr.next.prev = newNode;
        }

        curr.next = newNode;
        newNode.prev = curr;

        return head;
    }

    printList() {
        let curr = this.head;
        let result = [];
        while (curr !== null) {
            result.push(curr.data);
            curr = curr.next;
        }
        console.log(result.join(" <-> "));
    }
}

let dll = new solution();
dll.head = new Node(1);
dll.head.next = new Node(2);
dll.head.next.prev = dll.head;
dll.head.next.next = new Node(3);
dll.head.next.next.prev = dll.head.next;

console.log("Original Doubly Linked List:");
dll.printList(); // Output: 1 <-> 2 <-> 3

dll.addNode(dll.head, 1, 4); // Insert '4' at position 1

console.log("After Adding Node at Position 1:");
dll.printList();

