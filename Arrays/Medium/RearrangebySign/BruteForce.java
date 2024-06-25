package Arrays.Medium.RearrangebySign;

import java.util.ArrayList;
import java.util.Scanner;

public class BruteForce {
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
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // when you store elements in an ArrayList in Java and retrieve the elements using a.get(i), you will get the 
        // elements in the same order in which you added them. This is because an ArrayList in Java maintains the insertion order 
        // of the elements.
        for(int i = 0; i < n;i++){
            if(a[i] > 0){
                pos.add(a[i]);
            }
            else{
                neg.add(a[i]);
            }
        }

        for(int i = 0;i < n/2;i++){
            a[2*i] = pos.get(i);// for even positions
            a[2*i+1] = neg.get(i);// for odd positions
        }

        return a;

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


// Time Complexity: O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for 
//     adding those elements alternatively to the array, where N = size of the array A}.

// Space Complexity:  O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, 
//     where N = size of the array A}.