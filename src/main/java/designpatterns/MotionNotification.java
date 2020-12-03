package designpatterns;

public class MotionNotification extends Notification {

    private int details;

    public MotionNotification(int details) {
        this.details = details;

    }

    public String getMessage() {
        return "Motion detected with " + this.details + " centimeters under limit";
    }

}
