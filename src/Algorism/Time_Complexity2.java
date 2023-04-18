package Algorism;

import java.util.Scanner;

public class Time_Complexity2 {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        res = N * (N+1) / 2;
        sc.close();

        System.out.println(res);
    }
}
