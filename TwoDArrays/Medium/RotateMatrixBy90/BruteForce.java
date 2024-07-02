

package TwoDArrays.Medium.RotateMatrixBy90;
import java.util.Scanner;

public class BruteForce {
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
       int rotated[][] = new int[n][n];
       for(int i = 0;i < n;i++) {
        for(int j = 0;j < n;j++){
            rotated[j][n-1-i] = a[i][j];
        }
    }

    return rotated;
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
