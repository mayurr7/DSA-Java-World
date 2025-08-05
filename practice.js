function reverseString(str) {
    let st = str.split('');
    let left = 0, right = st.length - 1;

    while (left < right) {
        let temp = st[left];
        st[left] = st[right];
        st[right] = temp;

        left++;
        right--;
    }

    return st.join('');
}

console.log(reverseString("hello"));  // Output: "olleh"
