package Arrays.Medium.ProductExceptSelf;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans[] = find(a,n);
        printAraay(ans, n);
    }

    //https://www.youtube.com/watch?v=6GQEudo87tM
    private static int[] find(int[] nums, int n) {
        int[] result = new int[n];

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate right products and combine with left products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
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

//https://www.youtube.com/watch?v=6GQEudo87tM
// Time complexity - O(n)