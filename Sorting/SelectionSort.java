package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        selectionSort(a,n);
        printAraay(a,n);
    }

private static void printAraay(int[] a, int n) {
    for(int i = 0;i < a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
}

private static void selectionSort(int[] a, int n) {
    for(int i = 0;i < n;i++){
        int minPos = i;
        for(int j = i+1;j < n;j++){
            if(a[j] < a[minPos]){
                minPos = j;
            }
        }
        int temp = a[i];
        a[i] = a[minPos];
        a[minPos] = temp;
    }
}

private static void takeInput(int[] a, int n) {
    Scanner scn = new Scanner(System.in);
    for(int i = 0;i < a.length;i++){
        a[i] = scn.nextInt();
    }
}

}
