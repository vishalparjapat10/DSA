package BinarySearch.OneDArrays.SingleElement;

import java.util.Scanner;

public class Brute {
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
        if(a.length >= 2 && a[0] != a[1]){
            return a[0];
        }
        if(a.length >=2 && a[n-1] != a[n-2]){
            return a[n-1];
        }

        for(int i = 1;i < n-1;i++){
            if(a[i] != a[i-1] && a[i] != a[i+1]){
                return a[i];
            }
        }

        return -1;
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
