package StacksQu.Medium.NextGreaterElem2;

import java.util.Scanner;

public class Brute {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans[] = find(a,n);
        printAraay(ans, n);
    }

    private static int[] find(int[] a, int n) {
        int result[] = new int[n];
        for(int i = 0;i < n;i++){
            result[i] = -1;
            for(int j = 1;j < n;j++){
                if(a[(i+j)%n] > a[i]){
                    result[i] = a[(i+j)%n];
                    break;
                }
            }
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
