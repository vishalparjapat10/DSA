package Arrays.Easy.SingleNumber;

import java.util.Scanner;

public class SingleNumberBrute {
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
        int elem = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0;j < n;j++){
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count == 1){
                elem =  a[i];
            }
        }

        return elem;
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
