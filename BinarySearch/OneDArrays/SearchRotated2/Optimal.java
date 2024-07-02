package BinarySearch.OneDArrays.SearchRotated2;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
        takeInput(a);
		System.out.println();
		print(a);
        int target = scn.nextInt();
		boolean ans = doSomething(a,n,target);
        System.out.println(ans);
    }

    private static boolean doSomething(int[] a, int n,int target) {
       int low = 0;
       int high = n-1;
       while(low <= high){
        int mid = (low+high)/2;
        if(a[mid] == target){
            return true;
        }
        else if(a[low] == a[mid] && a[mid] == a[high]){
            low++;
            high--;
            continue;
        }
        else if(a[low] <= a[mid]){
            if(a[low] <= target && target < a[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        else{
            if(a[mid] < target && target <= a[high]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
       }

       return false;
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
