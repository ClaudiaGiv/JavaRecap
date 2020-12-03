package algorithms;

public class ArrayUtils {

    //    Scrieti un program care gaseste numarul care lipseste dintr-un array care contine toate numerele de la 1 la 1000, exceptand cel care lipseste, cu O(n), O(n).
    // a = [5, 2, 3, 1], n=4 , i ={1,..,5}
    // b=  [0, 1, 1, 1, 0, 1]
    //      0, 1, 2, 3, 4, 5
    public static int findMissingNumber(int[] a, int finalNumber) {
//        int v = 0;
        int[] b = new int[finalNumber + 1];
        //step 1
        for (int i = 1; i <= finalNumber; i++) {
            b[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }
        for (int i = 1; i <= finalNumber; i++) {
            if (b[i] == 0) {
                return i;
            }
        }
//        throw new Exception("There is no missing number!");
        return 0;
    }

    public static int findMissingNumberUsingSum(int[] a, int finalNumber) {
        int arraySum = 0;
        for (int i = 0; i < a.length; i++) {
            arraySum += a[i];
        }
        int sum = finalNumber * (finalNumber + 1) / 2;
        return sum - arraySum;

    }

    public static void swapWithoutAuxVar(int a, int b) {
        //using aux var
        //a=2, b=3
//        int aux = a;
//        a = b;
//        b = aux;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        //without aux var
        //a=2, b=3 => a=3  b=2
        a = a + b; // 2+3 = 5 => a = 5
        b = a - b; // 5-3 = 2 => b=2
        a = a - b; //=> a= 5-2 = 3
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
