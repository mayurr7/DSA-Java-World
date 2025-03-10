class Queue {
    constructor(){
        this.arrQueue = [];
    }

    enqueue(x){
        this.arrQueue.push(x);
    }

    dequeue() {
        if(this.isEmpty()) return -1;

        const dequeueEle = this.arrQueue.shift();

        return dequeueEle;
    }

    peek(){
        if(this.isEmpty()) return -1;

        return this.arrQueue[0];
    }

    isEmpty(){
        return this.arrQueue.length === 0;
    }

    printQueue(){
        console.log(this.arrQueue.join("->"));
        
    }
}

let queue = new Queue();

queue.enqueue(12);
queue.enqueue(121);
queue.enqueue(122);
queue.enqueue(123);

queue.printQueue();

console.log(queue.dequeue());
queue.printQueue();

console.log(queue.peek());

console.log(
    queue.isEmpty());




