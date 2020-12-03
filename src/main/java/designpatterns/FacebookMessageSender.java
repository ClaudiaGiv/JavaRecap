package designpatterns;

public class FacebookMessageSender implements MessageSender {

    public void sendMessage(String message) {
        Logger logger = Logger.getInstance();
        logger.log("message sent to facebook messenger: " + message);
    }
}
