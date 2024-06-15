package Arrays.Easy.LongestSubArrayWithSumK;

import java.util.HashMap;
import java.util.Scanner;

public class BetterApproach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int k = scn.nextInt();
        int ans = find(a,n,k);
        System.out.println(ans);
    }

    private static int find(int[] a, int n, int k) {
       int sum = 0;
       int maxLen = 0;
       HashMap<Integer,Integer> hmap = new HashMap<>();
       for(int i = 0;i < n;i++){
        sum += a[i];
        if(sum == k){
            maxLen = Math.max(maxLen, i+1);
        }

        int rem = sum - k;
        if(hmap.containsKey(rem)){
            int len = i - hmap.get(rem);
            maxLen = Math.max(maxLen, len);
        }

        if(!hmap.containsKey(sum)){
            hmap.put(sum,i);
        }
       }

       return maxLen;
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


// Time compl : O(n)
// Space complex : O(n)