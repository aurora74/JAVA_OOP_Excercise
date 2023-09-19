import static java.lang.Math.sqrt;

// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here

    /**
     * Checks if a given number is a prime number.
     *
     * @param n The number to check if it is prime.
     * @return true if n is a prime number, false otherwise.
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}