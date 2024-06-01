package BasicsMaths.ReverseDigits;

import java.util.Scanner;

public class ReverseDigita {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = reverse(n);
        System.out.println(ans);
    }

    private static int reverse(int n) {
        int rev = 0;
        while(n > 0){
            int d = n%10;
            rev = rev * 10 + d;
            n  = n /10;
        }

        return rev;
    }
}

// Time complexity O(log10 n)