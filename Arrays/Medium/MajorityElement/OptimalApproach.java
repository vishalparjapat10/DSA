package Arrays.Medium.MajorityElement;

import java.util.Scanner;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = find(a,n);
        System.out.println(ans);
    }

    private static int find(int[] a, int n) {
        int major = a[0];
        int count = 0;
        for(int i = 0;i < n;i++){
            if(a[i] == major){
                count++;
            }
            else{
                count--;
            }

            if(count == 0){
                major = a[i];
                count = 0;
            }
        }

        return major;
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
