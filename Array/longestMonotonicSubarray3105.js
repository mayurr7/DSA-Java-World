/**
 * @param {number[]} nums
 * @return {number}
 */
var longestMonotonicSubarray = function(nums) {

    if(nums.length === 1) return 1;

    let ans = 0;
    let incr = 1; let decr = 1;
    for(let i = 1; i < nums.length; i++){
        if(nums[i] > nums[i - 1]){
            incr++;
            ans = Math.max(ans,incr);
            decr = 1;
        }else if(nums[i] < nums[i - 1]){
           decr++;
           ans = Math.max(ans,decr);

           incr = 1;
        }else{
            incr = 1;
            decr = 1;
            ans = Math.max(ans,decr);
        }

    }return ans;

};
let nums = [3,2,1];


console.log(longestMonotonicSubarray(nums));
