import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.example.Week4;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(5, Week4.max2Int(3, 5));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(7, Week4.max2Int(7, 4));
    }

    @Test
    public void testMax2Int3(){
        assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int4(){
        assertEquals(5, Week4.max2Int(5, 1));
    }

    @Test
    public void testMax2Int5(){
        assertEquals(100, Week4.max2Int(100, 99));
    }

    @Test
    public void testMinArray1(){
        int[] arr1 = {3, 5, 1, 7, 2};
        assertEquals(1, Week4.minArray(arr1));
    }

    @Test
    public void testMinArray2(){
        int[] arr2 = {0, 0, 0, 0, 0};
        assertEquals(0, Week4.minArray(arr2));
    }

    @Test
    public void testMinArray3(){
        int[] arr3 = {-5, -3, -7, -1, -2};
        assertEquals(-7, Week4.minArray(arr3));
    }

    @Test
    public void testMinArray4(){
        int[] arr4 = {1, 2, 3, 4, 5};
        assertEquals(1, Week4.minArray(arr4));
    }

    @Test
    public void testMinArray5(){
        int[] arr5 = {100, 99, 101, 105, 102};
        assertEquals(99, Week4.minArray(arr5));
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.70));
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals("Bình thường", Week4.calculateBMI(60, 1.70));
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals("Thừa cân", Week4.calculateBMI(70, 1.70));
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals("Béo phì", Week4.calculateBMI(90, 1.70));
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals("Thiếu cân", Week4.calculateBMI(45, 1.70));
    }
} 