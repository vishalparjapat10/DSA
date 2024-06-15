package Arrays.Easy.MissingNumber;

import java.util.Scanner;

public class MissingNumberBrute2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        takeInput(a,n);
        printAraay(a,n);
        int ans = findMissingNumber(a,n);
        System.out.println(ans);
    }
}
