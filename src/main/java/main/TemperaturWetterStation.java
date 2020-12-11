package main;

public class TemperaturWetterStation implements Observer {
    private TemperaturSensor sensor;

    public TemperaturWetterStation(TemperaturSensor sensor) {
        this.sensor = sensor;
        this.sensor.register(this);
    }

    @Override
    public void update() {
        System.out.println("Temperatur-Wetterstation: " + sensor.getState());
    }
}
