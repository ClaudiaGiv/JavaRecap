package designpatterns;

public class StopAlarmCommand implements Command {
    AlarmForMotion alarm;

    public StopAlarmCommand(AlarmForMotion alarm) {
        super();
        this.alarm = alarm;
    }

    public void execute() {
        Logger logger = Logger.getInstance();
        logger.log("stopping alarm");
        alarm.stop();
    }
}