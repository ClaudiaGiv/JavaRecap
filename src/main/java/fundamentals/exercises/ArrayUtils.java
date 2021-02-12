package fundamentals.exercises;

public class ArrayUtils {

    //TODO: verify if java can return array
    public static boolean isPalindrom(int v[]) {
        for (int i = 0, j = v.length - 1; i <= j; i++, j--) {
            if (v[i] != v[j]) {
                return false;
            }
        }
        return true;
    }

    public static int[] sort(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        return v;
    }
}
