package designpatterns;

public class StartAlarmCommand implements Command {
    AlarmForMotion alarm;

    public StartAlarmCommand(AlarmForMotion alarm) {
        super();
        this.alarm = alarm;
    }

    public void execute() {
        Logger logger = Logger.getInstance();
        logger.log("starting alarm");
        alarm.start();
    }
}