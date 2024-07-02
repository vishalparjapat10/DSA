package BinarySearch.OneDArrays.MinimumSortedArray;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
        takeInput(a);
		System.out.println();
		print(a);
        System.out.println();
		int ans = doSomething(a,n);
        System.out.println(ans);
    }

    private static int doSomething(int[] a, int n) {
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low+high)/2;
            if(a[low] <= a[mid]){
                ans = Math.min(ans, a[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans, a[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }

    private static void takeInput(int[] a) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++) {
            a[i] = scn.nextInt();
		}
    }

    private static void print(int[] a) {
        for(int i = 0;i < a.length;i++) {
            System.out.print(a[i]+" ");
		}
    }
}
