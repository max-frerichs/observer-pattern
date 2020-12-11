package main;

public class TemperaturWebAnsicht implements Observer {

    private TemperaturSensor sensor;

    public TemperaturWebAnsicht(TemperaturSensor sensor) {
        this.sensor = sensor;
        this.sensor.register(this);
    }

    @Override
    public void update() {
        System.out.println("Temperatur-Web-Ansicht: " + sensor.getState());
    }
}