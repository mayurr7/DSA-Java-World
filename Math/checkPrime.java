package Math;

public class checkPrime {
    public static void main(String[] args) {
        System.out.println(isCheckPrime(7));
    }

    static boolean isCheckPrime(int n){
        int count = 0;
        for (int i = 1; i * i<= n; i++) {
            if(n % i == 0){
                count++;

                if(n / i != i){
                    count++;
                }
            }

           
        }

        if(count == 2){
            return true;
        }
        return false;
    }
}
