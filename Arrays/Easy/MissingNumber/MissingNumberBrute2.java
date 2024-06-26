package Arrays.Easy.MissingNumber;

import java.util.HashMap;
import java.util.Scanner;

public class MissingNumberBrute2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = findMissingNumber(a,n);
        System.out.println(ans);
    }

    private static int findMissingNumber(int[] a, int n) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0;i < n;i++){
            hmap.put(a[i],1);
        }

        for(int i = 1;i <= n;i++){
            if(!hmap.containsKey(i)){
                return i;
            }
        }

        return 0;
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


// Time Complexity: O(N) + O(N) ~ O(2*N),  where N = size of the array+1.
// Reason: For storing the frequencies in the hash array, the program takes O(N) time complexity and for checking the 
// frequencies in the second step again O(N) is required. So, the total time complexity is O(N) + O(N).

// Space Complexity: O(N), where N = size of the array+1. Here we are using an extra hash array of size N+1.