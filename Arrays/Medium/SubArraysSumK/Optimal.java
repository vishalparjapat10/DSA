package Arrays.Medium.SubArraysSumK;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Optimal {
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

    private static int find(int[] arr, int n, int k) {
        HashMap<Integer,Integer> mpp = new HashMap();
        int sum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            sum += arr[i];

            // Calculate x-k:
            int rem = sum - k;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(rem, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return cnt;
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
