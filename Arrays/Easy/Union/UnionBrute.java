package Arrays.Easy.Union;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnionBrute {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int a1[] = new int[n1];
        takeInput(a1,n1);
        printAraay(a1,n1);
        int n2 = scn.nextInt();
        int a2[] = new int[n2];
        takeInput(a2,n2);
        printAraay(a2,n2);
        ArrayList < Integer > ans = findUnion(a1,a2,n1,n2);
        for(int i = 0;i < ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }

    // Note :- this solution will not work, if elements negative, becuase in the case ans will not contain elemets that are sorted
    private static ArrayList < Integer > findUnion(int[] arr1, int[] arr2, int n, int m) {
        HashSet <Integer> s=new HashSet<>();
        ArrayList < Integer > Union=new ArrayList<>();
        for (int i = 0; i < n; i++)
            s.add(arr1[i]);
        for (int i = 0; i < m; i++)
            s.add(arr2[i]);
        for (int it: s)
            Union.add(it);
        return Union;
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
