package Patterns;

public class pattern6 {
  public static void main(String[] args) {
    pattern(4);
  }
   static void pattern(int n){
    for (int i = 1; i <= n; i++) {
      for(int j = 1; j <= n-i; j++){
        System.out.print("  ");

      }
      for(int k = n; k > n-i; k--){
        System.out.print("* ");
      }
      System.out.println();
    }
   }
}
