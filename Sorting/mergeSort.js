var mergeSort = (arr) => {
    if(arr.length <= 1) return arr;

    let mid = Math.floor(arr.length /2);


    let left =  mergeSort(arr.slice(0, mid));
    let right = mergeSort(arr.slice(mid));

 return merge(left, right);
}

var merge = (left, right) => {
    let result = [];

    let i = 0, j = 0;
    while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result.push(left[i]);
                i++;
            }else{
                result.push(right[j]);
                j++;
            }
    }
    return [...result,...left.slice(i), ...right.slice(j)];
}

let arr = [2,4,6,5,8,3];
console.log(merge(arr));
