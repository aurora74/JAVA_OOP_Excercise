public class Main {

        public static void main(String[] args) {
            Expression e1 = new Addition(new Square(new Numeral(10)), new Numeral(-3));
            Expression e2 = new Division(new Numeral(4), new Numeral((int) 0));
            Expression e3 = new Addition(e1, e2);
            Expression result = new Square(e3);

            System.out.println(result.toString());
            System.out.println(result.evaluate());
        }
}
