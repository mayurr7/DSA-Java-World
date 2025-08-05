package BinarySearch;

public class hIndex275 {
    public static void main(String[] args) {
        int citations[] = {0,2,3,4};
        System.out.println(hIndex(citations));
    }
    static int hIndex(int[] citations) {
        int start = 0; int end = citations.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(citations[mid] != mid + 1) {
                start = mid + 1;
            }
            
        }return -1;
    }
}
