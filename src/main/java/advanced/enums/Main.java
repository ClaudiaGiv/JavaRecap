package advanced.enums;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(LengthUnit.METER);
        System.out.println(LengthUnit.METER.value);
        System.out.println(LengthUnit.METER.name());
        System.out.println(LengthUnit.METER.ordinal());
        System.out.println(LengthUnit.METER.getDeclaringClass());
        System.out.println(LengthUnit.FOOT.convertToMeters());

        System.out.println(FileType.JSON.value);
        System.out.println(FileType.JSON.n);
        System.out.println(FileType.JSON.name());
        System.out.println(FileType.JSON.ordinal());

        System.out.println(PizzaStatus.ORDERED.getTimeToDelivery());
        System.out.println(PizzaStatus.DELIVERED.isDelivered());
        System.out.println(PizzaStatus.DELIVERED.isReady());
        HashMap a;
        HashSet b;

    }
}
