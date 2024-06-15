package Arrays.Medium.SortColors;

import java.util.Scanner;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        sort(a);
        printAraay(a,n);
    }

    private static void sort(int[] a) {
        int low = 0;
        int mid = 0;
        int high = a.length-1;
        while(mid <= high){
            if(a[mid] == 0){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else{
                int temp = a[high];
                a[high] = a[mid];
                a[mid] = temp;
                high--;
            }
        }
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
