import org.junit.*;
import static org.junit.Assert.assertEquals;

public class FinderTest {

    @Test
    public void test_findMax() {

        Finder find = new Finder();

        int[] intArray1 = null;
        Integer expected = null;
        Integer actual = find.findMax(intArray1);

        assertEquals(actual, expected);

        int[] intArray2 = {};
        expected = null;
        actual = find.findMax(intArray2);

        assertEquals(actual, expected);

        int[] intArray3 = {1, 2, 3};
        expected = 3;
        actual = find.findMax(intArray3);

        assertEquals(actual, expected);

    }

    @Test
    public void test_findMin() {

        Finder find = new Finder();

        int[] intArray1 = null;
        Integer expected = null;
        Integer actual = find.findMin(intArray1);

        assertEquals(actual, expected);

        int[] intArray2 = {};
        expected = null;
        actual = find.findMin(intArray2);

        assertEquals(actual, expected);

        int[] intArray3 = {1, 2, 3};
        expected = 1;
        actual = find.findMin(intArray3);

        assertEquals(actual, expected);

    }

}
