
class Solution {
    maxProduct(arr) {
        let currProd = 1, maxProdu = -Infinity;

        for(let i = 0; i < arr.length; i++){

            if(arr[i] === 0) break;

            if(arr[i] < 0 && currProd > 0) break;

            currProd = (currProd) * (arr[i]);

            maxProdu = Math.max(currProd, maxProdu);
        }

    }
}