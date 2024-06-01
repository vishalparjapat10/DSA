package BasicsMaths.ArmStrong;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = isArmStrong(n);
        System.out.println(ans);
    }

    private static boolean isArmStrong(int n) {
        int digits = 0;
        int dup1 = n;
        while(n > 0){
            digits++;
            n = n/10;
        }

        int num = 0;
        int dup2 = dup1;
        while(dup1 > 0){
            int d = dup1%10;
            num = num + (int)Math.pow(d, digits);
            dup1 = dup1/10;
        }

        if(num == dup2){
            return true;
        }
        return false;
    }
}

// Time Complexity O(log10 N)