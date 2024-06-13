package Arrays.Easy.LeftRotateByOne;

import java.util.Scanner;

public class LeftRotateOptimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        leftRotateByOne(a);
        printAraay(a, n);;
    
    }
    private static void leftRotateByOne(int[] a) {
        int first = a[0];
        for(int i = 0;i < a.length-1;i++){
            a[i] = a[i+1];
        }

        a[a.length-1] = first;
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
