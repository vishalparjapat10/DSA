package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        mergeSort(a,0,a.length-1);
        printAraay(a,n);
    }

    private static void printAraay(int[] a, int n) {
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    private static void mergeSort(int[] a, int low,int high) {
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    
    private static void merge(int[] a, int low, int mid, int high) {
       ArrayList<Integer> temp = new ArrayList<>();

       int left = low;
       int right = mid+1;
       while(left <= mid && right <= high){
        if(a[left] <= a[right]){
            temp.add(a[left]);
            left++;
        }
        else{
            temp.add(a[right]);
            right++;
        }
       
    }
    while(left <= mid){
        temp.add(a[left]);
        left++;
    }

    while(right <= high){
        temp.add(a[right]);
        right++;
    }

    // transfering all elements from temporary to arr //
    for (int i = low; i <= high; i++) {
        a[i] = temp.get(i - low);
    }

    }

    private static void takeInput(int[] a, int n) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
    }
}
