import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {

    /**
     * abc.
     * @throws IOException abc
     */
    public static void ioEx() throws IOException {
        FileReader fileReader = new FileReader("unknown.txt");
    }

    /**
     * Test IOException.
     * @return "Không có lỗi" nếu không có lỗi
     *         "Lỗi IO" nếu có lỗi
     */
    public static String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

    /**
     * abc.
     * @throws FileNotFoundException abc
     */
    public static void fileNotFoundEx() throws FileNotFoundException {
        FileReader fileReader = new FileReader("unknown.txt");
    }

    /**
     * Test FileNotFoundException.
     * @return "Không có lỗi" nếu không có lỗi
     *         "Lỗi File Not Found" nếu có lỗi
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * abc.
     */
    public static void arithmeticEx() {
        int a = 10;
        int b = 0;
        int c = a / b;
    }

    /**
     * Test ArithmeticException.
     * @return "Không có lỗi" nếu không có lỗi
     *         "Lỗi Arithmetic" nếu có lỗi
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * abc.
     */
    public static void arrayIndexOutOfBoundsEx() {
        int[] arr = new int[10];
        System.out.println(arr[12]);
    }

    /**
     * Test ArrayIndexOutOfBoundsException.
     * @return "Không có lỗi" nếu không có lỗi
     *         "Lỗi Array Index Out of Bounds" nếu có lỗi
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * abc.
     */
    public static void nullPointerEx() {
        String str = null;
        str.toString();
    }

    /**
     * Test NullPointerException.
     * @return "Không có lỗi" nếu không có lỗi
     *         "Lỗi Null Pointer" nếu có lỗi
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Main.
     * @param args abc
     */
    public static void main(String[] args) {
        System.out.println(ioExTest());
        System.out.println(fileNotFoundExTest());
        System.out.println(arithmeticExTest());
        System.out.println(arrayIndexOutOfBoundsExTest());
        System.out.println(nullPointerExTest());
    }
}
