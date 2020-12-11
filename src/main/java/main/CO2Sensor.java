package main;

import java.util.ArrayList;
import java.util.List;

public class CO2Sensor implements Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
 
    public void register(Observer observer) {
       this.observers.add(observer);
    }
 
    public int getState() {
       return state;
    }
 
    public void setState(int state) {
       this.state = state;
       this.notifyAllObservers();
    }
 
    public void remove(Observer observer) {
       this.observers.remove(observer);
    }
 
    public void notifyAllObservers() {
       for(Observer observer : this.observers) {
          observer.update();
       }   
    }	
    
}
