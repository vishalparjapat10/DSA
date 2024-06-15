package Arrays.Medium.MaxSubArray;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = find(a,n);
        System.out.println(ans);
    }

    // Explanation of Kadane's Algorithm:
    //     - Running Sum: The variable sum keeps track of the current subarray sum as you iterate through the array.
    //     - Max Sum: The variable maxi (which you initialized to Long.MIN_VALUE) stores the maximum sum encountered so far.
    //     - Resetting Sum: When sum drops below 0, it means the current subarray is not beneficial to extend, because adding a 
    //     negative sum to future elements would decrease the potential maximum subarray sum. Hence, you reset sum to 0 to start 
    //     fresh from the next element.
    private static int find(int[] nums, int n) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            
            if (sum > ans) {
                ans = sum;
            }
            
            if (sum < 0) {
                sum = 0;
            }
        }
        
        return ans;
    }

    private static void takeInput(int[] a, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
    }

    private static void printAraay(int[] a, int n) {
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}

// Time Complexity: O(N), where N = size of the array.
// Reason: We are using a single loop running N times.

// Space Complexity: O(1) as we are not using any extra space.