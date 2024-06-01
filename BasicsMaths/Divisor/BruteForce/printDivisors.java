package BasicsMaths.Divisor.BruteForce;

import java.util.Scanner;

public class printDivisors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] size = new int[1];
        int ans[] = printDivisors(n,size);
        for(int i = 0;i < size[0];i++){
            System.out.print(ans[i]+" ");
        }
    }

    private static int[] printDivisors(int n,int[] size) {
        int ans[] = new int[n];
        int count = 0;
        for(int i = 1;i <= n;i++){
            if(n%i == 0){
                ans[count++] = i;
            }
        }
        size[0] = count;
        return ans;
    }
}


// Time Complexity: O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check 
// if it is a divisor.

// Space Complexity : O(N) where N is the input number. The algorithm iterates through each number from 1 to n once to check 
// if it is a divisor.