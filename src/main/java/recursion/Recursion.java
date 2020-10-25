package recursion;

public class Recursion {

    int power(int x, int pow) {
        System.out.printf("x = %d, pow=%d\n", x, pow);
        if (pow == 0)
            return 0;
        pow = pow - 1;
        System.out.printf("%d * power(%d, %d)\n", x, x, pow);
        int z =  x* power(x, pow);
        System.out.printf("z= %d\n", z);
        System.out.printf("x = %d, pow=%d\n", x, pow);
        System.out.printf("%d * power(%d, %d)\n", x, x, pow);
        return z;
    }

    int multiply(int x, int y, int rez) {
        System.out.printf("x = %d, y=%d, rez=%d\n", x, y, rez);
        if (y == 0)
            return 0;
        if (y == 1)
            return 1;
        y = y - 1;
        rez += x*y;
        System.out.printf("multiply(%d, %d, %d)\n", x, y, rez);
        return multiply(x, y, rez);
//        System.out.printf("rez= %d\n", rez);
//        System.out.printf("x = %d, y=%d, rez=%d\n", x, y, rez);
//        System.out.printf("multiply(%d, %d, %d)\n", x, y, rez);
//        return rez1;
    }



}
