//https://leetcode.com/problems/first-bad-version/
package BinarySearch;

public class badVersion278 {
    public static void main(String[] args) {
        
    }
    public static int firstBadVersion(int n) {
        // int s = 0; int e = n;
        // if(n == 1) return 1;

        // while(s < e){
        //     int mid = s +(e-s)/2;
        //     if(isBadVersion(mid)){//isBadVersion  api call
        //         e = mid;
        //     }else{
        //         s = mid + 1;
        //     }
        // }
        // return s;

        //using recursion

        public int firstBadVersion(int n) {
            return binarySearch(1, n);
         }
     
         public int binarySearch(int start, int end){
             if(start >= end) return start;
     
             int mid = start + (end - start) /2;
             if(isBadVersion(mid)){
                 return binarySearch(start, mid);
             }else{
                 return binarySearch(mid + 1, end);
             }
         
    }
}
