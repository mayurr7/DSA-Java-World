package BinarySearch;

public class arrangingCoins441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        int start = 1; int end = n;

        while (start <= end) {
            int mid = start + (end - start)/2;

            long totalCoin = mid * (mid + 1)/2;

            if(totalCoin == n){
                return mid;
            }else if(totalCoin > n){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return end;
    }
}
