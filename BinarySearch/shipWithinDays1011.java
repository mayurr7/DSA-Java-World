package BinarySearch;

public class shipWithinDays1011 {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int num: weights){
            max = Math.max(num, max);
            sum += num;
        }

        int start = max; int end = sum;
        
        while (start < end) {
            int mid = start + (end - start )/2;

            if(canLooad(weights, days, mid)){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return start;
    }

    private static boolean canLooad(int[] weights, int days, int weight){
        int loadWeight = 0;  int dayCount = 1;

        for (int i = 0; i < weights.length; i++) {
            if(loadWeight + weights[i] > weight){
                dayCount ++;
                loadWeight = weights[i];

                if(dayCount > days){
                    return false;
                }
            }else{
                loadWeight += weights[i];
            }
        }
        return dayCount <= days;
    }
}
