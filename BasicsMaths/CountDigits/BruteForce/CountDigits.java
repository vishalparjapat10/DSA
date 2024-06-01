import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = countDigits(n);
        System.out.println(ans);
    }

    private static int countDigits(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }

        return count;
    }
}

// The time complexity of the countDigits function in your code is 𝑂(log10 𝑛), where 𝑛 is the value of the input integer.

// Explanation:
// - In each iteration of the while loop, the value of n is divided by 10.
// - The number of iterations required to reduce n to 0 is equal to the number of digits in n.
// Since each division by 10 reduces the value of n by one digit, the number of iterations is equal to the number of digits in n.