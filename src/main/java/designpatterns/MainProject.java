package designpatterns;

public class MainProject{
    public static void main(String[] arg) {

        Company1SmokeSensor smokeSensor = (Company1SmokeSensor) SensorFactory.createSensor("Company 1 smoke sensor", 25);
        Company2MotionSensor motionSensor = (Company2MotionSensor) SensorFactory.createSensor("Company 2 motion sensor", 12);

        SensorSystem sensorSystem = new SensorSystem();
        sensorSystem.register(smokeSensor);
        sensorSystem.register(motionSensor);

        smokeSensor.setNewVolume(26);
        motionSensor.setNewLength(11);

        sensorSystem.notifyObservers();

        HomeController remote = new HomeController();

        AlarmForMotion alarm = new AlarmForMotion();
        SprinklerForSmoke sprinkler = new SprinklerForSmoke();

        remote.setCommand(new StopAlarmCommand( alarm ));
        remote.buttonPressed();

        remote.setCommand(new TurnOffSprinklerCommand(sprinkler));
        remote.buttonPressed();
    }
}