import java.util.Scanner;

public class Solution {


    /**
     * Calculates the Fibonacci number at the specified index.
     *
     * @param n The index of the Fibonacci number to calculate.
     * @return The Fibonacci number at the specified index.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            long[] fibonacci = new long[(int) (n + 1)];
            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i <= n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                if (fibonacci[i] <0) {
                    return Long.MAX_VALUE;
                }
            }

            return fibonacci[(int) n];
        }
    }

    /**
     * This is the main method of the program. The result is then printed to the console.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long fibonacci = Solution.fibonacci(n);
        System.out.println(fibonacci);
    }

}