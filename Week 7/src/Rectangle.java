public class Rectangle extends Shape {

    protected double width;

    protected double length;

    protected Point topLeft;

    /**
     * abc.
     */
    public Rectangle() {
        this.width = 0.0;
        this.length = 0.0;
    }

    /**
     * abc.
     * @param width abc
     * @param length abc
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * abc.
     * @param width abc
     * @param length abc
     * @param color abc
     * @param filled abc
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    /**
     * abc.
     * @param topLeft abc
     * @param width abc
     * @param length abc
     * @param color abc
     * @param filled abc
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    /**
     * abc.
     * @return the top-left point of this rectangle
     */
    public Point getTopLeft() {
        return this.topLeft;
    }

    /**
     * abc.
     * @param topLeft abc
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * abc.
     * @return the width of this rectangle
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * abc.
     * @param width abc
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * abc.
     * @return the length of this rectangle
     */
    public double getLength() {
        return this.length;
    }

    /**
     * abc.
     * @param length abc
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * abc.
     * @return the area of this rectangle
     */
    public double getArea() {
        return this.width * this.length;
    }

    /**
     * abc.
     * @return the perimeter of this rectangle
     */
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    /**
     * abc.
     * @return a self-descriptive string
     */
    public String toString() {
        return "Rectangle[topLeft=" + this.topLeft.toString() + ",width="
                + String.format("%.1f", this.width)
                + ",length=" + String.format("%.1f", this.length)
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * abc.
     * @param o abc
     * @return true if this rectangle equals to o
     */
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle newRectangle = (Rectangle) o;
            return this.width == newRectangle.width && this.length == newRectangle.length
                    && this.topLeft.equals(newRectangle.topLeft);
        }
        return false;
    }

    /**
     * abc.
     * @return abc
     */
    public int hashCode() {
        return (int) (this.width * 1000 + this.length);
    }
}
