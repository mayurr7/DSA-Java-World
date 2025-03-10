/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let buyPrice = prices[0];
   let profit = 0;
    for(let i = 1; i < prices.length; i++){
        if(prices[i] < buyPrice){
           buyPrice = prices[i];
        }else{
            let newProfit = prices[i] - buyPrice;
            profit = Math.max(profit, newProfit);
        }
      
    }return profit;
      
};

let prices = [7,6,4,3,1];
console.log(maxProfit(prices));
