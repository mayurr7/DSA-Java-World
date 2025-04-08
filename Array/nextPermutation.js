class Solution {
    nextPermutation(arr) {
        let pivot = 0;
        for(let i = arr.length - 2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                pivot = i;
                break;
            }else{
                pivot = -1;
            }
        }

        if(pivot === -1){
            reverse(arr,0,arr.length-1);
            return;
        }

        for(let i = arr.length-1; i>= 0; i--){
            if(arr[i] > arr[pivot]){
                [arr[i],arr[pivot]] = [arr[pivot], arr[i]];
                break;
            }
        }

       
    reverse(arr,pivot+1, arr.length-1);
            
        
    }
}   

function reverse(arr, i, j){
    while(i <= j){
        [arr[i],arr[j]] = [arr[j], arr[i]];
        i++;
        j--;
    }
}

let obj = new Solution();
let arr = [1 ,2, 3, 6, 5, 4];
//let arr = [3, 4, 2, 5, 1];

 obj.nextPermutation(arr);
console.log(arr);
