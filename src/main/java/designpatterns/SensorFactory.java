package designpatterns;

public class SensorFactory {

    public static Sensor createSensor (String details, int parameter){
        Sensor sensor = null;
        if ("Company 1 smoke sensor".equals(details)) {
            sensor = new Company1Factory().createSmokeSensor(parameter);
        }
        if ("Company 1 motion sensor".equals(details)) {
            sensor = new Company1Factory().createMotionSensor(parameter);
        }
        if ("Company 2 smoke sensor".equals(details)) {
            sensor = new Company2Factory().createSmokeSensor(parameter);
        }
        if ("Company 2 motion sensor".equals(details)) {
            sensor = new Company2Factory().createMotionSensor(parameter);
        }
        return sensor;
    }
}
