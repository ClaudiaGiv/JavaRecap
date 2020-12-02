package advanced.java8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional {

    public static String concatenateIntegers(Integer x, Integer y){
        return x.toString()+y.toString();
    }

    public String concatenateIntegersInstance(Integer x, Integer y){
        return x.toString()+y.toString();
    }

    public static void main(String[] args) {
        //Function functional interface
        Function<String, Integer> func = x -> x.length();
        Integer res = func.apply("12");
        System.out.println(res);


        //echivalentul expresiei lambda
        Function<String, Integer> func2 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(func2.apply("12"));

        //Consumer FI
        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("test");
        consumer.andThen(consumer).accept("test2");

        //Because Collection<T> extends Iterable<T>, we can use Iterable<T>
        //forEach default method, which accepts a Consumer FI
        List<String> stringArrayList = Arrays.asList("a","b","c");
        stringArrayList.forEach(x-> System.out.println(x));

        //BinaryOperator
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;
        Integer sum = binaryOperator.apply(2,3);
        System.out.println(sum);

        //Predicate
        Predicate<Integer> predicate = x -> x>10;
        boolean result = predicate.test(12);
        System.out.println(result);

        //Bifunction
        BiFunction<Integer, Integer, String> biFunction = (x,y) -> x.toString()+y.toString();
        String bifunctionResult = biFunction.apply(22,5);
        System.out.println(bifunctionResult);

        //Bifunction with static method reference
        BiFunction<Integer, Integer, String> biFunction2 = Functional::concatenateIntegers;
        String bifunctionResult2 = biFunction2.apply(22,5);
        System.out.println(bifunctionResult2);

        //Bifunction with instance method reference
    //        Functional functional = new Functional();
    //        BiFunction<Integer, Integer, String> biFunction3 = functional::concatenateIntegers;
    //        String bifunctionResult3 = biFunction3.apply(22,5);
    //        System.out.println(bifunctionResult3);

        //streams filter
        List<String> lines = Arrays.asList("a","b","c");
        Stream<String> streamReulst = lines.stream().filter(x -> !x.equals("b"));
        System.out.println(streamReulst.collect(Collectors.toList()));



    }
}
