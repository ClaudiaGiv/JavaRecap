package designpatterns;

public class Company1Factory implements SensorAbstractFactory {

    public MotionSensor createMotionSensor(int length) {
        return new Company1MotionSensor(length);
    }

    public SmokeSensor createSmokeSensor(int volume) {
        return new Company1SmokeSensor(volume);
    }
}