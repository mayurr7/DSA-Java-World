/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  let set = new Set();

  for (let num of nums) {
    if(set.has(num)) return true;
    set.add(num);
  }
  return false;
};

console.log(containsDuplicate([1, 2, 3, 4, 5]));
