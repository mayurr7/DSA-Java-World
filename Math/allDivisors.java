package Math;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class allDivisors {
    public static void main(String[] args) {
        
        System.out.println(findDivisors(36));
    }
    public static ArrayList<Integer> findDivisors(int n){
            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 1; i * i <= n; i++) {
                if(n % i == 0){
                    list.add(i);

                    
                    if(i != n /i){
                        list.add(n/i);
                    }
                }

            }

            Collections.sort(list); 
            return list;
    }
}
