package fundamentals;

public class Main {
    public static void main(String[] args) {

        int v[] = {3,5,8,1,3,9};
        ArrayUtils.isPalindrom(v);
        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
        System.out.println("Javatpoint" + 10 + 20);
        Animal a = new Animal();
        a.x=10;
        System.out.println(a.x);
        changeAnimal(a);
        System.out.println(a.x);

    }

    public static Animal changeAnimal(Animal a){
        a = new Animal();
        System.out.println("Before: "+ a.x);
        a.x=3;
        System.out.println("After: "+ a.x);

        return a;
    }
}
