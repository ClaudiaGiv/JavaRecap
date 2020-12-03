package algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void testAreCircularPermuted(){
        String s1 = "mare";
        String s2 = "emar";
        assertTrue(StringUtils.areCircularPermuted(s1, s2));
    }


}