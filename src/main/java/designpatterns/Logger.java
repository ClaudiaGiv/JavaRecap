package designpatterns;

public class Logger {

    //create an object of SingleObject
    private static Logger instance = new Logger();
    //make the constructor private so that this class cannot be
    //instantiated
    private Logger(){}

    //Get the only object available
    public static Logger getInstance(){
        return instance;
    }

    public void log(String s){
        System.out.println("logger: "+s);
    }
}