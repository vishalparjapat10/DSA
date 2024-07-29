package Arrays.Medium.ProductExceptSelf;
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
        int res[] = new int[n];
        for(int i = 0;i < n;i++){
            int p = 1;
            for(int j = 0;j < n;j++){
                if(i != j){
                    p = p * a[j];
                }
            }
            res[i] = p;
        }

        return res;
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
