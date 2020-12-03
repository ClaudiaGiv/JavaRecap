package designpatterns;

public interface SensorAbstractFactory {
    MotionSensor createMotionSensor(int length);
    SmokeSensor createSmokeSensor(int volume);
}