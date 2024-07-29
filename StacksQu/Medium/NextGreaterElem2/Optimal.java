package StacksQu.Medium.NextGreaterElem2;

import java.util.Scanner;
import java.util.Stack;

public class Optimal {
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
        // https://www.youtube.com/watch?v=Du881K7Jtk8&t=392s
        Stack<Integer> st = new Stack<>();
        int result[] = new int[n];
        for(int i = (2*n) - 1;i >= 0;i--){
            while(!st.isEmpty() && st.peek() <= a[i%n]){
                st.pop();
            }
            if(i < n){
                if(!st.isEmpty()){
                    result[i] = st.peek();
                }
                else{
                    result[i] = -1;
                }
            }
            st.push(a[i%n]);
        }


        return result;
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
