

public class practice2 {
    public static void main(String[] args) {
        int arr[] = {2,2,2,2};
        System.out.println(getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        if(arr.length < 2) return -1;

        int first = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            first = Math.max(first, arr[i]);
        }


        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == first){
                continue;
            }else{
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }
}
