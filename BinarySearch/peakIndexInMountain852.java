package BinarySearch;

public class peakIndexInMountain852 {
    public static void main(String[] args) {
        int arr[] ={0,1,2,0};
        System.out.println(peakIndexInMountain(arr));
    }
    public static int peakIndexInMountain(int arr[]){
        int s =0 ;int e =arr.length-1;

        while (s < e) {
            int mid = s + (e -s )/2;

            if(arr[mid] > arr[mid +1]){
                e = mid;
            }else{
                s = mid +1;
            }
        }return s;
    }
}
