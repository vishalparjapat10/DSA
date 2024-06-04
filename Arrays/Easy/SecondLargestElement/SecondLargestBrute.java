package Arrays.Easy.SecondLargestElement;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestBrute {
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
        Arrays.sort(a);// but this will work if we don't have duplicate values in the array
        return a[a.length-2];
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


// Time Complexity: O(NlogN), For sorting the array

// Space Complexity: O(1)