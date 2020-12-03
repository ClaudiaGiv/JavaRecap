package designpatterns;

public interface Subject {

    public void register(Observer sensorObserver);
    public void notifyObservers();
}
