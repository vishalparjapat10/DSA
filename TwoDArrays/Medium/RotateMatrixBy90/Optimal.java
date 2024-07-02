package TwoDArrays.Medium.RotateMatrixBy90;

import java.util.Scanner;

public class Optimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a[][] = new int[n][n];
        takeInput(a);
		System.out.println();
		print(a);
		int ans[][] = doSomething(a,n);
        print(ans);
    }

    private static int[][] doSomething(int[][] a, int n) {
       // 1 - Transpose of the matrix
       for(int i = 0;i < n;i++) {
            for(int j = i+1;j < n;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // 2 - reverse each row of the matrix
        for(int i = 0;i < n;i++){
            reverse(a,i,0,n-1);
        }

        return a;
    }

    private static void reverse(int[][] a, int rowIndex, int start, int end) {
        while(start <= end){
            int temp = a[rowIndex][start];
            a[rowIndex][start] = a[rowIndex][end];
            a[rowIndex][end] = temp;
            start++;
            end--;
        }
    }

    private static void takeInput(int[][] a) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++){
                a[i][j] = scn.nextInt();
            }
		}
    }

    private static void print(int[][] a) {
        for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
		}
    }
}
