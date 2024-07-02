package BinarySearch.OneDArrays.KRotation;

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
        if(a.length == 0 || a[0] <= a[n-1]){
            return 0;
        }

        int k = 0;
        for(int i = 0;i < n-1;i++){
            if(a[i] > a[i+1]){
                k++;
                break;
            }
            else{
                k++;
            }
        }

        return k;
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
