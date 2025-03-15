class Stack{
    constructor(){
        this.stack = [];
    }

    push(x){
        this.stack.push(x);
    }

    pop(){
        return this.stack.pop();
    }
}

let isValid = function(s) {
    let char = s.split('');
    let stack = [];

    for(let i = 0; i < char.length; i++){
        if(char[i] === '(' || char[i] === '{' || char[i] === '[' ){
            stack.push(char[i]);
        }else{
            if(stack.length === 0) return false;

            let top = stack.pop();

            if( char[i] == ')' && top !== '(' ||
                char[i] == '}' && top !== '{' ||
                char[i] == ']' && top !== '['
            ) return false;
        }
    }
    return stack.length === 0;
}

let s = "{[]}()";

console.log(isValid(s));

