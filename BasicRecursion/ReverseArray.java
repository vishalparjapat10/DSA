package BasicRecursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }

        reverseArray(a,0,a.length-1);
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    private static void reverseArray(int[] a,int start,int end) {
        if(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            reverseArray(a, start+1, end-1);
        }
    }
}
