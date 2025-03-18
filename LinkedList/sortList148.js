class Node {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

class sort{
    constructor(head){
        this.head = null;
    }

    sortList(head){
        if(!head || !head.next) return head;

        let mid = findMid(head);
        let left = head;
        let right = mid.next;
        mid.next = null;

        let leftSorted = this.sortList(left);
        let rightSorted = this.sortList(right);

        return mergeList(leftSorted, rightSorted);
 
    }
    
};

var  mergeList = (left, right) =>{
    let dummy = new Node(-1);
    let curr = dummy;

    while(left !== null && right !==  null){
        if(left.val < right.val) {
            curr.next = left;
            left = left.next;
        }else{
            curr.next = right;
            right = right.next;
        }
        curr = curr.next;
    }

    if(left !== null) curr.next = left;
    if(right !== null) curr.next = right;

    return dummy.next;
}


var findMid = (head) => {
    let slow = head;
    let fast = head;
    while(fast.next  !== null && fast.next.next !== null){
        slow =  slow.next;
        fast = fast.next.next;

    }
    return slow;
}

var printList = (head) => {
    let curr = head;
    let result = [];
    while(curr !== null){
        result.push(curr.val)
        curr = curr.next;
    }
    console.log(result.join("->"));
    
};


let node = new Node(10);
node.next = new Node(1);
node.next.next = new Node(12);
node.next.next.next = new Node(5);
node.next.next.next.next = new Node(7);

console.log("Orignal List");
printList(node);




let sorted = new sort();
let sortedList = sorted.sortList(node);

console.log("Sorted List");

printList(sortedList);

