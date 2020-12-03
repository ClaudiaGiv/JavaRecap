package designpatterns;

public class SmokeSensor extends Sensor {

    private final int volume;

    private static final String description = "smoke sensor";

    public SmokeSensor(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String getDescription(){
        return description;
    }

}
