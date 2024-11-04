package Math;

public class uniqueNum {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3};
        System.out.println(uniqueNumArr(arr));
    }
    static int uniqueNumArr(int arr[]){
        int unique = 0;

        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
