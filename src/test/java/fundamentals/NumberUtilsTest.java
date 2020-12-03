package fundamentals;

import algorithms.ArrayUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberUtilsTest {

    @Test
    public void givenArrayFindMissingNumberShouldReturnTheMissingNumber(){
        int[] a = {1, 2, 4, 5};
        assertEquals(ArrayUtils.findMissingNumber(a, 5), 3);
    }

    @Test
    public void givenArrayFindMissingNumberUsingSumShouldReturnTheMissingNumber(){
        int[] a = {1, 2, 4, 5};
        ArrayUtils.swapWithoutAuxVar(2, 4);
        ArrayUtils.swapWithoutAuxVar(11, 103);
        assertEquals(ArrayUtils.findMissingNumberUsingSum(a, 5), 3);
    }
}
