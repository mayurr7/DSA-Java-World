package Array;

public class minEatingSpeed875 {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        System.out.println(minEatingSpeed(piles, 6 ));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 0;

        int maxSpeed = 0;
        for(int pile: piles){
            maxSpeed = Math.max(pile, maxSpeed);
        }

        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) /2;

            if(canEatInTime(piles, h, mid)) {
                maxSpeed = mid;
            }else{
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
       
    }

    private static boolean canEatInTime(int piles[], int h , int speed){
            int hours = 0;
            for(int value : piles){
                hours += (int) Math.ceil((double) value / speed);
            }
            return hours <= h;
    }
}

