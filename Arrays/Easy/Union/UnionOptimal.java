package Arrays.Easy.Union;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOptimal {
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

    private static ArrayList<Integer> findUnion(int[] a1, int[] a2, int n1, int n2) {
        // using 2 pointers approach
        int i = 0;
        int j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while(i < n1 && j < n2){
            if (a1[i] <= a2[j]){
                if(Union.size() == 0 || Union.get(Union.size()-1) != a1[i]){
                    Union.add(a1[i]);
                }
                i++;
            }
            else{
                if(Union.size() == 0 || Union.get(Union.size()-1) != a2[j])
                    Union.add(a2[j]);
                j++;
            }
        }

        while(i < n1){
                if(Union.size() == 0 || Union.get(Union.size()-1) != a1[i]){
                    Union.add(a1[i]);
                }
                i++;
        }

        while(j < n2){
            if(Union.size() == 0 || Union.get(Union.size()-1) != a2[j])
                Union.add(a2[j]);
            j++;
        }

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
