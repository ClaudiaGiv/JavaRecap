package designpatterns;

public class Company2Factory implements SensorAbstractFactory {

    public MotionSensor createMotionSensor(int length) {
        return new Company2MotionSensor(length);
    }

    public SmokeSensor createSmokeSensor(int volume) {
        return new Company2SmokeSensor(volume);
    }

}