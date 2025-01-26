package Array;

interface MountainArray {
    public int get(int index);
    public int length();
}

public class findInMountainArray1095 {
    public static void main(String[] args) {
      
    }

    public int findInMountainArray(int target,MountainArray mountainArr) {
        int p = findPeak(mountainArr);
        if(target == p){
            return p;
        }

        int s = 0; int peak = p; int end = mountainArr.length()-1;
        while (s < peak) {
            int mid = s + (peak - s)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }else if(mountainArr.get(mid) < target){
                s = mid + 1;
            }else{
                peak = mid -1;
            }
        }

        while (peak < end) {
            int mid = peak + (end - peak)/2;
            if(mountainArr.get(mid) == target){
                return mid;
            }else if(mountainArr.get(mid) < target){
                end = mid - 1;
            }else{
                peak = mid + 1;
            }
        }
        return -1;
    }
    private static int findPeak(MountainArray mountainArr){
        int s = 0; int e = mountainArr.length()-1;

        while (s < e) {
            int mid = s + (e - s)/2;

            if(mountainArr.get(mid) < mountainArr.get(mid + 1)){
                s = mid + 1;
            }else{
                e = mid;
            }
        }return s;
    }
}
