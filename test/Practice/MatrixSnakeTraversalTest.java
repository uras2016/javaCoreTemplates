package Practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixSnakeTraversalTest {

    MatrixSnakeTraversal matrixSnakeTraversal = new MatrixSnakeTraversal();
    @Test
    public void testPrint() throws Exception {
        int massive [][] = {{ 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9 }};
        int[] expected = {1, 4, 7, 8, 5, 2, 3, 6, 9};
        int[] result =matrixSnakeTraversal.print(massive);
        System.out.println(Arrays.toString(result));

        Assert.assertArrayEquals(expected,result);
    }

}
