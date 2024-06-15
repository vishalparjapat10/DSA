package Arrays.Easy.ConsecutiveOnes;

import java.util.Scanner;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = consecutiveOnes(a,n);
        System.out.println(ans);
    }

    private static int consecutiveOnes(int[] a, int n) {
        int max_count = 0;
        int count = 0;
        for(int i = 0;i < a.length;i++){
            if(a[i] == 1){
                count++;
            }
            else{
                count = 0;
            }

            max_count = Math.max(max_count, count);
        }

        return max_count;
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
