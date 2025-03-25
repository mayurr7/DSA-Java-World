/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var findThePrefixCommonArray = function(A, B) {
   
    let set = new Set();
    let C = [];
    let count = 0;
 
    for(let i = 0; i < A.length; i++){
         if(set.has(A[i])) count++;
         set.add(A[i]);
 
         if(set.has(B[i])) count++;
         set.add(B[i]);
 
         C.push(count);
    }return C;
 };