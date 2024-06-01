package BasicRecursion.StringPallindrome;

import java.util.Scanner;

public class WithoutRecursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean ans = isPallindrome(str);
        System.out.println(ans);
    }

    private static boolean isPallindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        boolean ans = true;
        while(i < j){
            char chI = str.charAt(i);
            char chJ = str.charAt(j);
            if(chI != chJ){
                ans = false;
            }
           
            i++;
            j--;
           
        }

        return ans;
    }
}
