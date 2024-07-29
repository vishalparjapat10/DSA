package BinarySearch.OneDArrays.SuccessfullPairs;

import java.util.Scanner;

public class Brute {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int spells[] = new int[n1];
        takeInput(spells);
		System.out.println();
		print(spells);
        System.out.println();
        int n2 = scn.nextInt();
		int potions[] = new int[n2];
        takeInput(potions);
		System.out.println();
		print(potions);
        System.out.println();
        int success = scn.nextInt();
		int ans[] = doSomething(spells,potions,success,n1,n2);
        print(ans);
    }


    private static int[] doSomething(int[] spells, int[] potions,int success,int n1, int n2) {
        int ans[] = new int[n1];
        for(int i = 0;i < n1;i++){
            int count = 0;
            for(int j = 0;j < n2;j++){
                if(spells[i] * potions[j] >= success){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }




    private static void takeInput(int[] a) {
        Scanner scn = new Scanner(System.in);
        for(int i = 0;i < a.length;i++) {
            a[i] = scn.nextInt();
		}
    }

    private static void print(int[] a) {
        for(int i = 0;i < a.length;i++) {
            System.out.print(a[i]+" ");
		}
    }
}


