package designpatterns;

public enum LoggerEnum {

    INSTANCE;

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void log(String s){
        System.out.println("logger: "+s+this.message);
    }
}
