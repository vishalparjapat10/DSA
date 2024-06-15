package Arrays.Medium.SortColors;

import java.util.Scanner;

public class BetterApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        sort(a);
        printAraay(a,n);
    }

    private static void sort(int[] a) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) cnt0++;
            else if (a[i] == 1) cnt1++;
            else cnt2++;
        }

        //Replace the places in the original array:
        for (int i = 0; i < cnt0; i++) a[i] = 0; // replacing 0's

        for (int i = cnt0; i < cnt0 + cnt1; i++) a[i] = 1; // replacing 1's

        for (int i = cnt0 + cnt1; i < n; i++) a[i] = 2; // replacing 2's
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

// Time Complexity: O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.

// Space Complexity: O(1) as we are not using any extra space.