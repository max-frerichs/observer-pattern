package main;

public class TemperaturAnzeige implements Observer {

    private TemperaturSensor sensor;

    public TemperaturAnzeige(TemperaturSensor sensor) {
        this.sensor = sensor;
        this.sensor.register(this);
    }

    @Override
    public void update() {
        System.out.println("Temperaturanzeige: " + sensor.getState());
    }
}
