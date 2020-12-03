package designpatterns;

public abstract class Notification {

    public abstract String getMessage();

    public void sendNotification(MessageSender messageSender){
        messageSender.sendMessage(this.getMessage());
    }
}
