package Arrays.Easy.MissingNumber;

import java.util.Scanner;

public class MissingNumberBrute1 {
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
        for(int i = 1;i <= n;i++){
            int flag = 0;
            for(int j = 0;j < n;j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
            }

            if(flag == 0){
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


// Time Complexity: O(N2), where N = size of the array+1.
// Reason: In the worst case i.e. if the missing number is N itself, the outer loop will run for N times, and for every single 
//number the inner loop will also run for approximately N times. So, the total time complexity will be O(N2).

// Space Complexity: O(1)  as we are not using any extra space.