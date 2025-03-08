class listNode {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class Stack {
  constructor() {
    this.top = null;
  }

  printStack() {
    let curr = this.top;
    let result = [];

    while (curr !== null) {
      result.push(curr.data);
      curr = curr.next;
    }
    console.log(result.join(" -> "));
  }

  push(data) {
    let node = new listNode(data);
    node.next = this.top;
    this.top = node;
  }

  pop() {
    if (this.top === null) return -1;

    let popEle = this.top;
    this.top = this.top.next;
    return popEle;
  }

  peek() {
    return this.isEmpty() ? -1 : this.top.data;
  }

  isEmpty() {
    return this.top === null;
  }
}

let stack = new Stack();

stack.push(10);
stack.push(102);
stack.push(1052);
stack.push(1055);

stack.printStack();

stack.pop();

stack.printStack();
console.log(stack.peek());

console.log(stack.isEmpty());
