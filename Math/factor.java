package Math;

public class factor {
    public static void main(String[] args) {
        factor2(36);
    }
    static void factorN(int n){
        for(int i =1; i < n; i++){
            if(n % i ==0){
                System.out.print(i + " ");
            }
        }
    }

    //method 2
    static void factor2(int n){
        for (int i =1 ; i <= Math.abs(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }else{
                    System.out.print( " " + i + " ");
                }
            }
        }
    }
}
