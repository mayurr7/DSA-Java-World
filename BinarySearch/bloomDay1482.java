package BinarySearch;

public class bloomDay1482 {
    public static void main(String[] args) {
        int bloomDay[] = {97,83};
        System.out.println(minDays(bloomDay, 2, 1));
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(m * k > n){
            return -1;
        }

        int max= 0;
        int min = Integer.MAX_VALUE;
        for(int num: bloomDay){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

         int result = -1;
        while (min <= max) {
            int mid = min + (max - min)/2;

            if(checkAdjacent(bloomDay, m, k, mid)){
                result = mid;
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return result;
    }

    private static boolean checkAdjacent(int bloomDay[], int m, int k, int day){
        int count = 0; int bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= day){
                count++;
            }
            else {
                bouquets += (count / k);
                count = 0;
            }
        }
        bouquets += (count / k);
        return bouquets >= m;
    
    }
}

