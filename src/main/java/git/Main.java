package git;

public class Main {
    private Main(){

    }

    public static void main(String[] args) {
//        System.out.println(10 * 20 + "Javatpoint");
//        System.out.println("Javatpoint" + 10 * 20);
//        System.out.println("Javatpoint" + (10 + 20));
//        char a = 'a';
//        System.out.println(a + 10);
//        String s = 10*20 + "aa";
//        System.out.println(s);
        String s1 = "Ana";
        String s2 = "Ana";
        String s3 = new String("Ana");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        //Autoboxing
        Integer i = 10;
        //Unboxing
        int x = i.intValue();
        Integer a =10;
        Integer b = 10;
        System.out.println(a==b);
        System.out.println(a.equals(b));

        Double a1 = 10.2;
        Double b1 = 10.2;
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1));

        Character a2 ='1';
        Character b2 ='1';
        System.out.println(a2==b2);
        System.out.println(a2.equals(b2));

        Integer y = Integer.valueOf("10");


    }
}
