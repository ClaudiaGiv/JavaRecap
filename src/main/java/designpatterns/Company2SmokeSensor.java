package designpatterns;

public class Company2SmokeSensor extends SmokeSensor implements Observer {

    private static final String description = "Company 2 smoke sensor";

    private int newVolume;

    public Company2SmokeSensor(int volume) {
        super(volume);
    }

    public String getDescription(){
        return description;
    }

    public int getNewVolume() {
        return newVolume;
    }

    public void setNewVolume(int newVolume) {
        this.newVolume = newVolume;
    }

    public void detect() {
        if (this.newVolume>super.getVolume()) {
            Logger logger = Logger.getInstance();
            logger.log("smoke detected");

            SmokeNotification smokeNotification = new SmokeNotification(super.getVolume()- newVolume);
            smokeNotification.sendNotification(new FacebookMessageSender());
            smokeNotification.sendNotification(new SmsMessageSender());

            SprinklerForSmoke sprinkler = new SprinklerForSmoke();
            TurnOnSprinklerCommand turnon = new TurnOnSprinklerCommand(sprinkler);
            turnon.execute();

        }

    }
}