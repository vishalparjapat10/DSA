package Arrays.Medium.SubArraysSumK;

import java.util.Scanner;

public class BruteForce {
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
        int count = 0;
        for(int i = 0;i < n;i++){
            int sum = 0;
            for(int j = i;j < n;j++){
                sum += a[j];
                if(sum == k){
                    count++;
                }
            }
        }

        return count;
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
