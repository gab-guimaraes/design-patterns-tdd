package org.johnwick182.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArray() {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {3,2,1};
        int[] result = reverseArray.reverseArray(array);
        int[] expected = {1,2,3};
        Assert.assertArrayEquals("Arrays is not the same: ",array, expected);
    }
}
