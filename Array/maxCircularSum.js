class Solution {
    // Function to find maximum circular subarray sum.
    circularSubarraySum(arr) {
        // code here

        function maxSum(arr){
            let currSum = 0,  max= -Infinity;

            for(let i = 0; i < arr.length; i++){
                currSum += arr[i];

                if(currSum < 0){
                    currSum = 0;
                }
                max= Math.max(currSum, max);
            }return max;
        }



        function minSum(arr){
            let currSum = 0, min = Infinity;

            for(let i = 0; i < arr.length; i++){
                currSum += arr[i];

                if(currSum > 0){
                    currSum = 0;
                }
                min= Math.min(currSum, min);
            }return min;
        }

        let sumOfArr = arr.reduce((a, b) => a+b);
        let maxVal = maxSum(arr);
        let minVal = minSum(arr);

        if(maxVal < 0) return maxVal;

        let circularMax = sumOfArr - minVal;

        return Math.max(circularMax, maxVal);
    }
    
    
}

let obj = new Solution();
let arr = [-7 ,32, -11, 21, 18, 35, -26, -17, 35, -12, -38, -33, 32, 16, 44, 11, -40, -21, 2, 27, -35, 21, -37, -12, 1];
console.log(obj.circularSubarraySum(arr));
