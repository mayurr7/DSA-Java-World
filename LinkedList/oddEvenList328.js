class Node {
  constructor(val) {
    this.val = val;
    this.next = null;
  }
}

class solution {
  constructor() {
    this.head = null;
  }

  oddEvenList(head) {
    if (head === null) return head;
    let odd = head;
    let even = head.next;
    let evenHead = head.next;

    while (odd.next !== null && even.next !== null) {
      odd.next = odd.next.next;
      even.next = even.next.next;
      odd = odd.next;
      even = even.next;
    }
    odd.next = evenHead;

    return head;
  }
}

let node = new solution();
node.head = new Node(1);
node.head.next = new Node(2);
node.head.next.next = new Node(3);
node.head.next.next.next = new Node(4);
node.head.next.next.next.next = new Node(5);

let newHead = node.oddEvenList(node.head);

// Function to print the linked list
const printList = (head) => {
  let temp = head;
  let result = [];
  while (temp !== null) {
    result.push(temp.val);
    temp = temp.next;
  }
  console.log(result);
};

printList(newHead);
