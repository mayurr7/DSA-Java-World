package BinarySearch;

public class findeLetter744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters, 'j'));      
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int s = 0; int e = letters.length-1;
        
        while (s <= e) {
            int mid = s + (e - s)/2;

            if(target < letters[mid]){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
            
        }return letters[s % letters.length];
    }
}
