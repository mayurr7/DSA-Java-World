class Stack {
  constructor() {
    this.stack = [];
  }

  push(element) {
    this.stack.push(element);
  }

  pop() {
    return this.stack.length === 0 ? -1 : this.stack.pop();
  }

  top() {
    return this.stack[this.stack.length - 1];
  }

  isEmpty() {
    return this.stack.length - 1 < 0;
  }

  printStack() {
    console.log(this.stack.join("->") || "Stack is empty");
  }
}

let stack = new Stack();

stack.push(10);
stack.push(20);
stack.push(30);
stack.push(300);
stack.push(3);

stack.push(40);
console.log(stack.top());
console.log(stack.isEmpty());

stack.printStack();

stack.pop();
stack.pop();
stack.pop();
stack.pop();
stack.pop();
stack.pop();
stack.printStack();
console.log(stack.top());
console.log(stack.isEmpty());
