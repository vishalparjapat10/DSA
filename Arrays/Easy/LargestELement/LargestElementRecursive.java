package Arrays.Easy.LargestELement;

import java.util.Scanner;

public class LargestElementRecursive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = findLargest(a,0);
        System.out.println(ans);
    }

    private static int findLargest(int[] a,int idx) {
        if(idx == a.length){
            return -1;
        }
        int ans = findLargest(a, idx+1);
        if(ans < a[idx]){
            ans = a[idx];
        }

        return ans;
    }

    private static void printAraay(int[] a, int n) {
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    private static void takeInput(int[] a, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
    }
}


// Time Complexity: O(N)

// Space Complexity: O(1)