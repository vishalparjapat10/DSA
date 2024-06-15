package Arrays.Easy.MissingNumber;

import java.util.Scanner;

// Intuition:
// We know that the summation of the first N numbers is (N*(N+1))/2. We can say this S1. Now, in the given array, every number 
// between 1 to N except one number is present. So, if we add the numbers of the array (say S2), the difference between S1 and S2 
// will be the missing number. Because, while adding all the numbers of the array, we did not add that particular number that is 
// missing.
public class MissingNumberOptimal {
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
        int s1 = n * (n+1) / 2;
        int s2 = 0;
        for(int i = 0;i < a.length;i++){
            s2 = s2 + a[i];
        }

        int missingNumber = s1 - s2;
        return missingNumber;
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
