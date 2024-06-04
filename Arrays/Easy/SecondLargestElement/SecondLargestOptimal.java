package Arrays.Easy.SecondLargestElement;

import java.util.Scanner;

public class SecondLargestOptimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = findSecondLargest(a);
        System.out.println(ans);
    }

    private static int findSecondLargest(int[] a) {
        int lar = a[0];
        int sec = -1;
        for(int i = 1;i < a.length;i++){
            if(lar < a[i]){
                sec = lar;
                lar = a[i];
            }
            else if(sec < a[i]){
                sec = a[i];
            }
        }

        return sec;
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

// Time - O(N)
// Space - O(1)
