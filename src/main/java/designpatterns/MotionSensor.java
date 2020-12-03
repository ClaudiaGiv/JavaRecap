package designpatterns;

public class MotionSensor extends Sensor {

    private final int length;
    private static final String description = "motion sensor";

    public MotionSensor(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public String getDescription(){
        return description;
    }

}
