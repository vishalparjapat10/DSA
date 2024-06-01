package BasicRecursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
