package BinarySearch.OneDArrays.KRotation;

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

    private static int doSomething(int[] arr, int n) {
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[mid]){
                if(arr[low] < ans){
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            }
            else{
                if(ans > arr[mid]){
                    ans = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }


        return index;
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
