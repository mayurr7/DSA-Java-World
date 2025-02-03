class Node {
  
    constructor(data) {
        this.data = data;
        this.next = null;
       
    }
}

class solution{
    constructor(){
        this.head = null;
    }

  getDecimalValue(head) {
        let curr = head;
        let count = 0;
    
        while(curr !== null){
            count++;
            curr = curr.next;
        }
    
        let sum = 0;
        curr = head;
    
        while(curr !== null){
            sum = sum + curr.data*(Math.pow(2, --count));
            curr = curr.next;
        }
        return sum;
    }
}

let node = new solution();
node.head = new Node(1);
node.head.next = new Node(0);
node.head.next.next = new Node(1);

console.log(node.getDecimalValue(node.head));