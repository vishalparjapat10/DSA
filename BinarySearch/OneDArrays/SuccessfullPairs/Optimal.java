package BinarySearch.OneDArrays.SuccessfullPairs;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int spells[] = new int[n1];
        takeInput(spells);
		System.out.println();
		print(spells);
        System.out.println();
        int n2 = scn.nextInt();
		int potions[] = new int[n2];
        takeInput(potions);
		System.out.println();
		print(potions);
        System.out.println();
        int success = scn.nextInt();
		int ans[] = doSomething(spells,potions,success,n1,n2);
        print(ans);
    }

    private static int[] doSomething(int[] spells, int[] potions, int success, int n1, int n2) {
        Arrays.sort(potions);
        int ans[] = new int[n1];
        for(int i = 0;i < n1;i++){
            int count = 0;
            int low = 0;
            int high = n2-1;
            while(low <= high){
                int mid = (low+high)/2;
                if((spells[i] * potions[mid]) >= success){
                    count = mid;
                    high = mid - 1;
                }
                else if((spells[i] * potions[mid]) < success){
                    low = mid + 1;
                }
            }
            ans[i] = count != 0 ? n2 - count : 0;
        }

        return ans;
    }

    private static void takeInput(int[] a) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++) {
            a[i] = scn.nextInt();
		}
    }

    private static void print(int[] a) {
        for(int i = 0;i < a.length;i++) {
            System.out.print(a[i]+" ");
		}
    }
}

// Time Complexity
// - Sorting the potions array: This takes O(n2 log n2) time
// - Binary search for each element in the spells array: For each of the n1 elements in spells, you perform a binary search on the potions array, which takes 
// 𝑂(log 𝑛2)
// Thus, the overall time complexity is:
// O(n2 * log n2) + O(n1 * log n2)