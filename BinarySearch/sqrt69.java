package BinarySearch;

public class sqrt69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
    public static int mySqrt(int x) {
        if(x == 0) return 0;
        int start = 1; int end = x; int ans= 1;
        while (start <= end) {
            int mid = start+ (end - start) /2;
            if(mid  >= x / mid){
                end = mid - 1; 
                ans = mid;
            }else{
                start = mid + 1;
               
            }
        }return ans;
    }
}
