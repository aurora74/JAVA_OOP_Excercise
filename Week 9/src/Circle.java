public class Circle implements GeometricObject {

    public static final double PI = 3.14;

    private double radius;

    private Point center;

    public Circle(Point center, double radius) {
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * abc.
     * @return the info of the circle
     */
    public String getInfo() {
        return "Circle"
                + "[(" + String.format("%.2f", center.getPointX())
                + "," + String.format("%.2f", center.getPointY()) + "),"
                + "r=" + String.format("%.2f", radius) + "]";
    }
}
