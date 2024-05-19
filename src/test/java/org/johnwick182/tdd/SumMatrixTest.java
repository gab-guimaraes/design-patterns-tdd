package org.johnwick182.tdd;

import static org.junit.jupiter.api.Assertions.assertThrows;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;

public class SumMatrixTest extends TestCase {

    private SumMatrix sumMatrix;

    @BeforeEach
    public void setUp() {
        sumMatrix = new SumMatrix();
    }

    public void testSumMatrix() {
        int[][] matrix = {{1,2,3},{3,2,1}};
        int expected = 12;
        int result = sumMatrix.sumMatrix(matrix);
        assertEquals(expected, result);
    }

    public void testNullMatrix(){
        assertThrows(NullPointerException.class, () -> sumMatrix.sumMatrix(null));
    }
}