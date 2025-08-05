class Solution {
    // Function to get the minimum difference between the heights.
     getMinDiff(arr, k) {
        arr.sort((a,b)=> a-b);
        let min = arr[0] + k;
        let max = arr[arr.length-1] - k;
        return max - min;
    }
}


let obj = new Solution();
let arr = [3, 9, 12, 16, 20]
console.log(obj.getMinDiff(arr, 3));






