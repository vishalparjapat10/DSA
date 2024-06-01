// We can optimise the previous approach by using the property that for any non-negative integer n, if d is a divisor of n then n/d 
// is also a divisor of n.

// This property is symmetric about the square root of n by traversing just the first half we can avoid redundant iteration and 
// computations improving the efficiency of the algorithm.

package BasicsMaths.Divisor.Optimal;

import java.util.ArrayList;
import java.util.Scanner;

public class printDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> ans = printDivisors(n);
        for(int i = 0;i < ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    private static ArrayList<Integer> printDivisors(int n) {
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> divisiors = new ArrayList<>();
        for(int i = 1;i <= sqrt;i++){
            if(n%i == 0){
                divisiors.add(i);
            }

            if(i != n/i){
                divisiors.add(n/i);
            }
        }

        return divisiors;
    }
}


// Time Complexity: O(sqrt(N)) where N is the input number. The algorithm iterates through each number from 1 to the 
// square root of N once to check if it is a divisor.

// Space Complexity : O(2*sqrt(N))where N is the input number. This approach allocates memory for an array to hold all 
// the divisors. The size of this array could go to be 2*(sqrt(N)).