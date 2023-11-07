import java.util.List;

public class ShapeUtil {

    /**
     * abc.
     * @param shapes shapes
     * @return info
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder sb1 = new StringBuilder("Circle:\n");

        StringBuilder sb2 = new StringBuilder("Triangle:\n");

        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                sb1.append(shape.getInfo()).append("\n");
            }
        }

        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                sb2.append(shape.getInfo()).append("\n");
            }
        }

        return sb1.append(sb2).toString();
    }
}
