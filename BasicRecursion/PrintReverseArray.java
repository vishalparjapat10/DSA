package BasicRecursion;

import java.util.Scanner;

public class PrintReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
        print(a,0);
    }

    private static void print(int[] a, int i) {
        if(i == a.length){
            return;
        }
        print(a,i+1);
        System.out.print(a[i]+" ");
    }
}
