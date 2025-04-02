
function fact(n){

    if(n === 0) return 0;
    if(n ===  1) return 1;

    return fact(n - 1) + fact(n - 2);

}

function print(n){
    let result = [];
    for(let i = 0; i <= n; i++){
        result.push(fact(i));
    }
    console.log(result);
    
}
console.log(print(5));
