import java.util.ArrayList;
import java.util.List;

public class Layer {

    private List<Shape> shapes = new ArrayList<>();

    /**
     * add shape.
     * @param shape shape
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * remove circles.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * remove duplicate shapes.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
        }
    }

    /**
     * get info.
     */
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            info.append(shape.toString()).append("\n");
        }
        return info.toString();
    }
}
