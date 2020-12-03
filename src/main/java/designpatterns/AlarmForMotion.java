package designpatterns;

public class AlarmForMotion {
    void start() {
        Logger logger = Logger.getInstance();
        logger.log("alarm started");
    }

    void stop() {
        Logger logger = Logger.getInstance();
        logger.log("alar stopped");
    }
}