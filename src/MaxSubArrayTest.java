import org.junit.Test;

        import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void max() throws Exception {
        int[] a = {3, 3, 3, 1, -1};
        int[] resultA = {0, 3};
        int[] b = {3, -1, 4, 5, 6};
        int[] resultB = {0, 4};
        int[] c = {1, -16, 1, 3};
        int[] resultC = {2, 3};
        int[] d = {2, -1, 3, -4};
        int[] resultD = {0, 2};
        int[] e = {16, -20, -10, 1};
        int[] resultE = {0, 0};

        assertArrayEquals(resultA, MaxSubArray.max(a));
        assertArrayEquals(resultB, MaxSubArray.max(b));
        assertArrayEquals(resultC, MaxSubArray.max(c));
        assertArrayEquals(resultD, MaxSubArray.max(d));
        assertArrayEquals(resultE, MaxSubArray.max(e));
    }
}