package BasicsMaths.CheckPallindrome;

import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = checkPallindrome(n);
        System.out.println(ans);
    }

    private static boolean checkPallindrome(int n) {
        if(n < 0){
            return false;
        }
        if(n == 0){
            return true;
        }

        int rev = 0;
        int copy = n;
        while(n > 0){
            int d = n%10;
            rev = rev * 10 + d;
            n = n/10;
        }

        if(rev == copy){
            return true;
        }

        return false;
    }
}

// Time Complexity: O(log10N + 1) where N is the input number. The time complexity is determined by the number of digits in the input integer N. In the worst case when N is a multiple of 10 the number of digits in N is log10 N + 1.

// In the while loop we divide N by 10 until it becomes 0 which takes log10N iterations.
// In each iteration of the while loop we perform constant time operations like modulus and division and pushing elements into the vector.
// Space Complexity: O(1) as only a constant amount of additional memory for the reversed number regardless of size of the input number.
