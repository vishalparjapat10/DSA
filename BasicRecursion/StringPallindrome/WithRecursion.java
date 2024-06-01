package BasicRecursion.StringPallindrome;

import java.util.Scanner;

public class WithRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean ans = isPallindrome(str,0,str.length()-1);
        System.out.println(ans);
    }

    private static boolean isPallindrome(String str, int i, int j) {
       if(i == j || i > j){
        return true;
       }

       if(i < j){
        char chI = str.charAt(i);
        char chJ = str.charAt(j);
        if(chI != chJ){
            return false;
        }
       }
       return isPallindrome(str, i+1, j-1);
    }
}

// Time Complexity: O(N) { Precisely, O(N/2) as we compare the elements N/2 times and swap them}.

// Space Complexity: O(1) { The elements of the given array are swapped in place so no extra space is required}.
