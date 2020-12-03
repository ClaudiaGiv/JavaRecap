package designpatterns;

public class SmokeNotification extends Notification {

    private int details;

    public SmokeNotification(int details) {
        this.details = details;

    }


    public String getMessage() {
        return "You excedeed smoke limit with " + this.details;
    }
}
