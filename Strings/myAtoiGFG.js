/**
 * @param {string} s
 * @return {number}
 */
var myAtoi = function(s) {
    let i = 0, result = 0, num = 0, sign = 1, n = s.length;

    while(i < n && s[i] === ' '){
        i++;
    }

    if(i < n && s[i] === '-'){
        sign = -1;
        i++;
    }else  if(i < n && s[i] === '+'){
        sign = 1;
        i++;
    }

    while(i < n && s[i] >= '0' && s[i] <= '9'){
        num = s.charCodeAt(i) - '0'.charCodeAt(0);
        result = result * 10 + num;

        if(result * sign > 1 * 2**31 - 1) return 1 * 2**31 -1;
        if(result * sign < -1 *  2**31) return -1 * 2**31;
        i++;
    }
    return result * sign;
};

// let obj = new Solution();
let s = "   -042";
console.log(myAtoi(s));
