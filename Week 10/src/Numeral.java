public class Numeral extends Expression {

    private double value;

    public Numeral() {
        this.value = 0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString((int) this.value);
    }

    @Override
    public double evaluate() {
        return this.value;
    }
}
