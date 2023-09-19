import static java.lang.Math.abs;

public class Solution {
    private int numerator;
    private int denominator = 1;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Sets the denominator of the fraction.
     *
     * @param denominator The new denominator of the fraction.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
            return;
        }
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) {
            this.denominator = 1;
        }
    }

    /**
     * Find GCD.
     *
     * @return GCD of two numbers.
     */
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return abs(gcd(b, a % b));
        }
    }

    /**
     * Reduces the fraction to its lowest terms.
     *
     * @return The reduced fraction.
     */
    public Solution reduce() {
        int ucln = gcd(numerator, denominator);

        numerator = numerator / ucln;
        denominator = denominator / ucln;

        return this;
    }

    /**
     * Adds two fractions.
     *
     * @param other The other fraction to add.
     * @return The sum of the two fractions.
     */
    public Solution add(Solution other) {
        if (other.denominator == 0) {
            return this;
        }

        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;

        return this.reduce();
    }

    /**
     * Subtracts two fractions.
     *
     * @param other The other fraction to subtract.
     * @return The difference of the two fractions.
     */
    public Solution subtract(Solution other) {
        if (other.denominator == 0) {
            return this;
        }

        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;

        return this.reduce();
    }

    /**
     * Multiplies two fractions.
     *
     * @param other The other fraction to multiply.
     * @return The product of the two fractions.
     */
    public Solution multiply(Solution other) {
        if (other.denominator == 0) {
            return this;
        }

        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;

        return this.reduce();
    }

    /**
     * Divides two fractions.
     *
     * @param other The other fraction to divide by.
     * @return The quotient of the two fractions.
     */
    public Solution divide(Solution other) {
        if (other.numerator == 0 || other.denominator == 0) {
            return this;
        }

        this.numerator = this.numerator * other.denominator;
        this.denominator = this.denominator * other.numerator;

        return this.reduce();
    }

    /**
     * Check equals .
     *
     * @param obj The Object.
     * @return result equals or not.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return this.numerator * other.denominator == this.denominator * other.numerator;
        }
        return false;
    }

    public static void main (String[] args) {
        Solution fraction = new Solution(2, 4);
        Solution other = new Solution(1, 1);
        Solution other2 = new Solution(0, 2);

        fraction.add(other);
        System.out.println(fraction.numerator);
        System.out.println(fraction.denominator);

        fraction.divide(other2);

        System.out.println(fraction.numerator);
        System.out.println(fraction.denominator);
    }

}