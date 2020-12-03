package git;

import java.io.FileNotFoundException;

public class SubClass extends AbstractClass {

    public final void f1() {
        if (true) {
            throw new RuntimeException();
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void f2() throws FileNotFoundException {
        f3();
        throw new NullPointerException();
    }

    public final void f3() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("catch");
        } catch (RuntimeException e) {
            System.out.println("catch2");
        } finally {
            System.out.println("finally");

        }

    }

    public final void f4() {
        try {
            throw new FileNotFoundException();
        } catch (NullPointerException | FileNotFoundException  e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");

        }

    }
}








