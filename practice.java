import java.util.Arrays;

public class practice {
  public static void main(String[] args) {
    int arr[] = { 3,5,3,2,0 };
    System.out.println((peakIndexInMountainArray(arr)));

  }

  public static int peakIndexInMountainArray(int[] arr) {
    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int mid = s + (e - s) / 2;

      if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
        return mid;
      } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
        e = mid - 1;
      } else if (mid < arr.length && arr[mid] < arr[mid + 1]) {
        s = mid + 1;
      }

    }
    return -1;
  }

}
