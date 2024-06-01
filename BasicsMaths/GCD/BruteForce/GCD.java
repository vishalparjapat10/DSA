// The Greatest Common Divisor of any two integers is the largest number that divides both integers.

// Example 1:
// Input:N1 = 9, N2 = 12
                
// Output:3
// Explanation:Factors of 9: 1, 3 and 9
// Factors of 12: 1, 2, 3, 4, 6, 12
// Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.
// Example 2:
// Input:N1 = 20, N2 = 15
                
// Output: 5
// Explanation:Factors of 20: 1, 2, 4, 5
// Factors of 15: 1, 3, 5
// Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD.

package BasicsMaths.GCD.BruteForce;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int ans = gcd(n1,n2);
        System.out.println(ans);
    }

    private static int gcd(int n1,int n2) {
        int c = 1;
        int min = Math.min(n1, n2);
        int i = 2;
        while(i <= min){
            if(n1%i == 0 && n2%i == 0){
                c = i;
            }
            i++;
        }

        return c;
    }
}


// Time Complexity: O(min(N1, N2)) where N1 and N2 is the input number. The algorithm iterates from 1 to the minimum of N1 and N2 
// and each iteration checks whether both the numbers are divisible by the current number (constant time operations).

// Space Complexity: O(1)as the space complexity remains constant and independent of the input size. Only a fixed amount of memory 
// is required to store the integer variables.