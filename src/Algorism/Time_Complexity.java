package Algorism;
import java.util.Scanner;


public class Time_Complexity {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i<=N; i++){
            res += i;
        }

        sc.close();
        System.out.println(res);
    }
}
