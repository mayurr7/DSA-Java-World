package Hashing;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 1, 2, 5, 4, 1, 5 };
        countEle(arr);

    }

    static void countEle(int arr[]) {
        Scanner sc = new Scanner(System.in);
        int hash[] = new int[12];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        int q =5;

        while (q > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
            q--;
        }
    }
}
