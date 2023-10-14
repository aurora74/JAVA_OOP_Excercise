public class Point {

    private double pointX;

    private double pointY;

    /**
     * abc.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * abc.
     * @return the x-coordinate of this point
     */
    public double getPointX() {
        return this.pointX;
    }

    /**
     * abc.
     * @param pointX abc
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * abc.
     * @return the y-coordinate of this point
     */
    public double getPointY() {
        return this.pointY;
    }

    /**
     * abc.
     * @param pointY abc
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * abc.
     * @param newPoint abc
     * @return the distance between this point and newPoint
     */
    public double distance(Point newPoint) {
        return Math.sqrt(Math.pow(this.pointX - newPoint.pointX, 2)
                + Math.pow(this.pointY - newPoint.pointY, 2));
    }

    /**
     * abc.
     * @param o abc
     * @return true if this point equals o, false otherwise
     */
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point newPoint = (Point) o;
            return this.pointX == newPoint.pointX
                    && this.pointY == newPoint.pointY;
        }
        return false;
    }

    /**
     * abc.
     * @return hashcode of this point
     */
    public int hashCode() {
        return (int) (this.pointX * 1000 + this.pointY);
    }

    /**
     * abc.
     * @return a self-descriptive string
     */
    public String toString() {
        return "(" + String.format("%.1f", this.pointX)
                + "," + String.format("%.1f", this.pointY) + ")";
    }
}
