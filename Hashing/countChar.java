package Hashing;

public class countChar {
    public static void main(String[] args) {
        String name = "avavcsvav";
    }

    static void countCharr(String name){
        int hash[] = new int[26];
        for (int i = 0; i < name.length(); i++) {
            hash[name[i]]++;
        }
    }
}
