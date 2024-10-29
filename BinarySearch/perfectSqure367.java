package BinarySearch;

public class perfectSqure367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(144));
    }
    public static boolean isPerfectSquare(int num) {
        int ans = mySqrt(num);
        if(ans *ans == num) {
            return true;
        }return false;
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
