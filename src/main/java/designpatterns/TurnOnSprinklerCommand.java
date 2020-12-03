package designpatterns;

public class TurnOnSprinklerCommand implements Command {
    SprinklerForSmoke sprinkler;

    public TurnOnSprinklerCommand(SprinklerForSmoke sprinkler) {
        super();
        this.sprinkler = sprinkler;
    }

    public void execute() {
        Logger logger = Logger.getInstance();
        logger.log("turning on sprinkler");
        sprinkler.turnOn();
    }
}