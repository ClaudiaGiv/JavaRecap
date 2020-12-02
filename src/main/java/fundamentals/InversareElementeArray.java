package fundamentals;

class InversareElementeArray {


    public static void main(String[] args) {
        int[] n = {1, 34, 89, 2, 7};

        int m[] = reverseArray(n);
        for (int j = 0; j < m.length; j++) {
            System.out.print(m[j] + " ");
        }
        System.out.println();
        for (int j = 0; j < n.length; j++) {
            System.out.print(n[j] + " ");
        }
        int x = 4;
        int y = change(x);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }


    public static int change(int x) {
        System.out.println("Before change: x=" + x);
        x = 5;
        System.out.println("After change: x=" + x);
        return x;
    }

    private static int[] reverseArray(int[] n) {
        for (int i = 0, j = n.length - 1; i <= j; i++, j--) {
            int a = n[i];
            n[i] = n[j];
            n[j] = a;
        }
        return n;
    }
}
