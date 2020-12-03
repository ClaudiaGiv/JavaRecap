package designpatterns;

public class Company1SmokeSensor extends SmokeSensor implements Observer {

    private static final String description = "Company 1 smoke sensor";

    private int newVolume;

    public int getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(int newVolume) {
        this.newVolume = newVolume;
    }

    public Company1SmokeSensor(int volume) {
        super(volume);
    }

    public String getDescription() {
        return description;
    }

    public void detect() {

        if (this.newVolume > super.getVolume()) {

            Logger logger = Logger.getInstance();
            logger.log("smoke detected");
            LoggerEnum.INSTANCE.setMessage("a");

            LoggerEnum.INSTANCE.log("smoke detected enum");


            SmokeNotification smokeNotification = new SmokeNotification(super.getVolume()- newVolume);
            smokeNotification.sendNotification(new FacebookMessageSender());
            smokeNotification.sendNotification(new SmsMessageSender());

            SprinklerForSmoke sprinkler = new SprinklerForSmoke();
            TurnOnSprinklerCommand turnon = new TurnOnSprinklerCommand(sprinkler);
            turnon.execute();


        }
    }
}

