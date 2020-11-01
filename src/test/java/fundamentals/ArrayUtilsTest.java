package fundamentals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {


    @BeforeEach
    void setUp() {
        System.out.println("Run before each test");
    }

    static Stream<int[]> palindromArrays(){
        return Stream.of( new int[] {1,3,1}, new int[] {2,3,3,2});
    }

    static Stream<int[]> notPalindromArrays(){
        return Stream.of( new int[] {1,3,3}, new int[] {2,3,1,2});
    }

    @ParameterizedTest
    @MethodSource("palindromArrays")
    void isPalindrom_shouldReturnTrue(int[] n) {
        assertTrue(ArrayUtils.isPalindrom(n));
    }

    @ParameterizedTest
    @MethodSource("notPalindromArrays")
    void isPalindrom_shouldReturnFalse(int[] n) {
        assertFalse(ArrayUtils.isPalindrom(n));
    }


    @Test
    void verifySort() {
        int v[] = {3, 5, 8, 1, 3, 9};
        int sortedV[] = {1,3,3,5,8,9};
        assert(Arrays.equals(ArrayUtils.sort(v), sortedV));
    }

    @ParameterizedTest
    @CsvSource({"mare,rema,true", "mare,rexa,false"})
    void verifyAreCircularPermuted(String s1, String s2, boolean arePermuted) {
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(arePermuted);
        assertEquals(arePermuted, StringUtils.areCircularPermuted(s1,s2));
        HashMap a;
        LinkedHashMap b;
        TreeSet c;
        TreeMap f;

    }

}
