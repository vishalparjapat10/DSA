package Arrays.Medium.MajorityElement;

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
        int maj = -1;
        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0;j < n;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > (n/2)){
                maj = a[i];
                break;
            }
        }
        return maj;
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

// Time COmplexity : O(n^2)
// Space Complexity : O(1)