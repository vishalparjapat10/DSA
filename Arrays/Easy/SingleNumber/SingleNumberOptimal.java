package Arrays.Easy.SingleNumber;

import java.util.Scanner;

public class SingleNumberOptimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = findSingleNumber(a,n);
        System.out.println(ans);
    }

    private static int findSingleNumber(int[] a, int n) {
        // Intuition:
        //     Two important properties of XOR are the following:

        //     XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
        //     XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ←Property 2

        //     Here all the numbers except the single number appear twice and so will form a pair. Now, if we perform XOR of all 
        //     elements of the array, the XOR of each pair will result in 0 according to the XOR property 1. The result will 
        //     be = 0 ^ (single number) = single number (according to property 2).

        //     So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number.

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ a[i];
        }
        return xorr;
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
