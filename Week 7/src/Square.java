public class Square extends Rectangle {

    /**
     * abc.
     */
    public Square() {
        super();
    }

    /**
     * abc.
     * @param side abc
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * abc.
     * @param side abc
     * @param color abc
     * @param filled abc
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * abc.
     * @param topLeft abc
     * @param side abc
     * @param color abc
     * @param filled abc
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * abc.
     * @return the side of this square
     */
    public double getSide() {
        return this.width;
    }

    /**
     * abc.
     * @param side abc
     */
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * abc.
     * @param side abc
     */
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * abc.
     * @param side abc
     */
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * abc.
     * @return a self-descriptive string
     */
    public String toString() {
        return "Square[topLeft=" + this.topLeft.toString()
                + ",side=" + String.format("%.1f", this.width)
                + ",color=" + this.color + ",filled=" + this.filled + "]";
    }

    /**
     * abc.
     * @param o abc
     * @return abc
     */
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square newSquare = (Square) o;
            return this.topLeft.equals(newSquare.topLeft)
                    && this.width == newSquare.width;
        }
        return false;
    }
}
