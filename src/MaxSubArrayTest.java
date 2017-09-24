import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void max() throws Exception {
        int[] a = {3, 3, 3, 1, -1};
        int[] b = {3, -1, 4, 5, 6};
        int[] c = {1, -16, 1, 3};
        int[] d = {2, -1, 3, -4};
        int[] e = {16, -20, -10, 1};
        assertEquals("0 3 ", new MaxSubArray(a).toString());
        assertEquals("0 4 ", new MaxSubArray(b).toString());
        assertEquals("2 3 ", new MaxSubArray(c).toString());
        assertEquals("0 2 ", new MaxSubArray(d).toString());
        assertEquals("0 0 ", new MaxSubArray(e).toString());
    }
}