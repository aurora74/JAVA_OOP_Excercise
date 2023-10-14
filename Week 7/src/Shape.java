public abstract class Shape {

    protected String color;

    protected boolean filled;

    /**
     * abc.
     */
    public Shape() {
        this.color = null;
        this.filled = false;
    }

    /**
     * abc.
     * @param color abc
     * @param filled abc
     */
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * abc.
     * @return the color of this shape
     */
    public String getColor() {
        return this.color;
    }

    /**
     * abc.
     * @param color abc
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * abc.
     * @return true if this shape is filled, false otherwise
     */
    public boolean isFilled() {
        return this.filled;
    }

    /**
     * abc.
     * @param filled abc
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * abc.
     * @return the area of this shape
     */
    public abstract double getArea();

    /**
     * abc.
     * @return the perimeter of this shape
     */
    public abstract double getPerimeter();

    /**
     * abc.
     * @return a self-descriptive string
     */
    public String toString() {
        return "Shape[color=" + this.color + ",filled=" + this.filled + "]";
    }
}
