package designpatterns;

public class SprinklerForSmoke {
    public  void turnOn() {
        Logger logger = Logger.getInstance();
        logger.log("sprinkler is on");;
    }

    public void turnOff() {
        Logger logger = Logger.getInstance();
        logger.log("sprinkler is off");
    }
}