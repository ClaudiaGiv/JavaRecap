package designpatterns;

public class SmsMessageSender implements MessageSender {

    public void sendMessage(String message) {
        Logger logger = Logger.getInstance();
        logger.log("message sent to sms: "+message);
    }
}
