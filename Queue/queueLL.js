class Node{
    constructor(val){
        this.val = val;
        this.next = null;
    }
}

class Queue{
    constructor(){
        this.front = null;
        this.rear = null;

    }

    enqueue(x){
        let node =  new Node(x);
        
        if(this.rear == null){
            this.front = this.rear = node;
            return;
        }

        this.rear.next = node;
        this.rear = node;
        
    }

    dequeue(){
        if(this.front === null) return -1;

        let popVal = this.front.val;
        this.front = this.front.next;

        if(this.front === null){
            this.rear = null;
        }

        return popVal;
    }

    peek(){
        if(this.front === null) return -1;

        return this.front.val;
    }

    isEmpty(){
        return this.front === null;
    }

    print(){
        let arr = [];
        let curr = this.front;

        while(curr !== null){
            arr.push(curr.val);
            curr = curr.next;
        }

        console.log(arr.join("->"));
        
    }

}

let queue = new Queue();

queue.enqueue(10);
queue.enqueue(11);
queue.enqueue(12);
queue.enqueue(13);
queue.enqueue(104);


queue.print();
console.log(queue.dequeue());
console.log(queue.peek());
queue.dequeue();
queue.dequeue();
queue.dequeue();
queue.dequeue();
queue.dequeue();
console.log(queue.peek());
queue.enqueue(1000);
queue.print();

console.log(queue.isEmpty());



