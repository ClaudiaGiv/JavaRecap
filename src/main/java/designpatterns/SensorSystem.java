package designpatterns;

import java.util.ArrayList;

class SensorSystem implements Subject {
    private ArrayList<Observer> sensors;

    public SensorSystem(){
        this.sensors = new ArrayList<Observer>();
    }

    public void register(Observer sensorObserver) {
        sensors.add(sensorObserver);
    }

    public void notifyObservers() {
       for (Observer s : sensors){
           s.detect();
       }
    }
}