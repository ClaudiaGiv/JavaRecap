package designpatterns;

public class TurnOffSprinklerCommand implements Command {
    SprinklerForSmoke sprinkler;

    public TurnOffSprinklerCommand(SprinklerForSmoke sprinkler) {
        super();
        this.sprinkler = sprinkler;
    }

    public void execute() {
        Logger logger = Logger.getInstance();
        logger.log("turning off sprinkler");
        sprinkler.turnOff();
    }
}