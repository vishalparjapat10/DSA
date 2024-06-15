package Arrays.Easy.SingleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumberBruteBetter {
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
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0;i < n;i++){
            int value = hmap.getOrDefault(a[i], 0);
            hmap.put(a[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> it : hmap.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        return -1;
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

// Time : O(n)
// Space : Space Complexity: O(M) as we are using a map data structure
