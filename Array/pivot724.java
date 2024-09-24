package Array;

public class pivot724 {
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(findPivot724(arr));
    }
    static int findPivot724(int arr[]){
        
        int Sum =0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
        int leftSum =0;
        int rightSum = Sum;

        for (int i = 0; i < arr.length; i++) {
            rightSum = rightSum - arr[i];

            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];

        }
        return -1;
    }
}
