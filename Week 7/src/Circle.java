public class Circle extends Shape {

    protected double radius;

    protected Point center;

    /**
     * abc.
     */
    public Circle() {
        this.radius = 0.0;
    }

    /**
     * abc.
     * @param radius abc
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * abc.
     * @param radius abc
     * @param color abc
     * @param filled abc
     */
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /**
     * abc.
     * @param center abc
     * @param radius abc
     * @param color abc
     * @param filled abc
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        this.center = center;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    /**
     * abc.
     * @return the center of this circle
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * abc.
     * @param center abc
     */
    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * abc.
     * @return the radius of this circle
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * abc.
     * @param radius abc
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * abc.
     * @return the area of this circle
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * abc.
     * @return the perimeter of this circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    /**
     * abc.
     * @return a self-descriptive string
     */
    public String toString() {
        return "Circle[center=" + this.center.toString() +  ",radius="
                + String.format("%.1f", this.radius)
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * abc.
     * @param o abc
     * @return abc
     */
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle newCircle = (Circle) o;
            return this.radius == newCircle.radius && this.center.equals(newCircle.center);
        }
        return false;
    }

    /**
     * abc.
     * @return abc
     */
    public int hashCode() {
        return (int) (this.radius * 1000 + this.center.hashCode());
    }
}
