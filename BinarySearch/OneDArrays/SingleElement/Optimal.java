package BinarySearch.OneDArrays.SingleElement;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[] = new int[n];
        takeInput(a);
		System.out.println();
		print(a);
        System.out.println();
		int ans = doSomething(a,n);
        System.out.println(ans);
    }

    private static int doSomething(int[] nums, int n) {
        int low = 0;
		int high = nums.length - 1;
		
		// checking boundary cases
		if(high == 0) {
			return nums[0];
		}
		else if(nums[0] != nums[1]) {
			return nums[0];
		}
		else if(nums[high] != nums[high-1]) {
			return nums[high];
		}
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			// checking if we have unique element at mid
			if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]) {
				return nums[mid];
			}
			else if((mid%2 == 0 && nums[mid] == nums[mid+1]) || (mid%2 == 1 && nums[mid] == nums[mid-1])) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return -1;
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
