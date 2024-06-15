package Arrays.Medium.MaxSubArray;

import java.util.Scanner;

public class BruteForce {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = find(a,n);
        System.out.println(ans);
    }

    private static int find(int[] a, int n) {
        if (a.length == 0) {
            return 0; // Edge case: empty array
        }
        
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum with the smallest possible integer
        
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        return maxSum;
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

//. time - O(n^2)
// space - O(1)
