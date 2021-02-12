package fundamentals.exercises;

public class StringUtils {

    public static boolean areCircularPermuted(String s1, String s2) {
        //mare
        //rema
        //remarema

        if (s1.length() != s2.length()) {
            return false;
        }
        s2 += s2;
        return s2.contains(s1);
    }
}
