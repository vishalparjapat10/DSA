package Arrays.Medium.MajorityElement;

import java.util.Arrays;
import java.util.Scanner;

public class BetterApproach {
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
        Arrays.sort(a);
        return a[n/2];
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

// Time complexity : O(n*log n)
// space : O(1)