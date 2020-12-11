package main;

public class CO2Anzeige implements Observer {

    private CO2Sensor sensor;

    public CO2Anzeige(CO2Sensor sensor) {
        this.sensor = sensor;
        this.sensor.register(this);
    }


    @Override
    public void update() {
        System.out.println("CO2-Wert: " + sensor.getState());
        if(sensor.getState() <= 800) {
            System.out.println("WARNING!");
        }
    }
}
