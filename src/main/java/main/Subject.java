package main;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    public abstract void register(Observer observer);
    public abstract void remove(Observer observer);
    public abstract void notifyAllObservers();   
}