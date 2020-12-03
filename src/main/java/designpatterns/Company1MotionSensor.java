package designpatterns;

public class Company1MotionSensor extends MotionSensor implements Observer {

    private static final String description = "Company 1 motion sensor";

    private int newLength;

    public int getNewLength() {
        return newLength;
    }

    public void setNewLength(int newLength) {
        this.newLength = newLength;
    }

    public Company1MotionSensor(int length) {
        super(length);


    }

    public String getDescription(){
        return description;
    }


    public void detect() {

        if (newLength < super.getLength()) {
            Logger logger = Logger.getInstance();
            logger.log("motion detected");

            MotionNotification motionNotification = new MotionNotification(super.getLength()-newLength);
            motionNotification.sendNotification(new FacebookMessageSender());
            motionNotification.sendNotification(new SmsMessageSender());


            //I could have invoked the alarm directly, but this is better suited for command pattern
            AlarmForMotion alarm = new AlarmForMotion();
            StartAlarmCommand start = new StartAlarmCommand(alarm);
            start.execute();

        }
    }
}