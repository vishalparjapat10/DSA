package Arrays.Medium.SortColors;

import java.util.HashMap;
import java.util.Scanner;

public class BruteForceApp1 {
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
        HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i < a.length;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}
		int k = 0;
		for(int i = 0;i < map.get(0);i++) {
			a[k] = 0;
			k++;
		}
		for(int i = 0;i < map.get(1);i++) {
			a[k] = 1;
			k++;
		}
		for(int i = 0;i < map.get(2);i++) {
			a[k] = 2;
			k++;
		}
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

// Time Complexity :- O(n)
// Space Complexity :- O(u), where u is the number of unique elements in the array