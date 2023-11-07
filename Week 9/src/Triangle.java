public class Triangle implements GeometricObject {

    private Point p1;

    private Point p2;

    private Point p3;

    /**
     * abc.
     * @param p1 abc
     * @param p2 abc
     * @param p3 abc
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if ((p1.getPointX() == p2.getPointX() && p1.getPointY() == p2.getPointY())
                || (p1.getPointX() == p3.getPointX() && p1.getPointY() == p3.getPointY())
                || (p2.getPointX() == p3.getPointX() && p2.getPointY() == p3.getPointY())) {
            throw new RuntimeException("Same point");

        } else if ((p2.getPointY() - p1.getPointY()) * (p3.getPointX() - p2.getPointX())
                == (p3.getPointY() - p2.getPointY()) * (p2.getPointX() - p1.getPointX())) {
            throw new RuntimeException("Same line");
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * abc.
     * @return the area of the triangle
     */
    public double getArea() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a + b + c) / 2;

        return Double.parseDouble(String.format(
                "%.2f", Math.sqrt(s * (s - a) * (s - b) * (s - c))));
    }

    /**
     * abc.
     * @return the perimeter of the triangle
     */
    public double getPerimeter() {
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        return Double.parseDouble(String.format("%.2f", a + b + c));
    }

    /**
     * abc.
     * @return the info of the triangle
     */
    public String getInfo() {
        return "Triangle"
                + "[(" + String.format("%.2f", p1.getPointX())
                + "," + String.format("%.2f", p1.getPointY())
                + "),(" + String.format("%.2f", p2.getPointX())
                + "," + String.format("%.2f", p2.getPointY())
                + "),(" + String.format("%.2f", p3.getPointX())
                + "," + String.format("%.2f", p3.getPointY())
                + ")]";
    }
}
