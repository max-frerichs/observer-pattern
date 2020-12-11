package main;


public class MultiAnzeige implements Observer {

    private TemperaturSensor temperaturSensor;
    private CO2Sensor co2Sensor;

    public MultiAnzeige(TemperaturSensor temperaturSensor, CO2Sensor co2Sensor) {
        this.temperaturSensor = temperaturSensor;
        this.co2Sensor = co2Sensor;
        this.temperaturSensor.register(this);
        this.co2Sensor.register(this);
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("Multi-Anzeige: ");

        System.out.println("Temperatur:" + temperaturSensor.getState());
        System.out.println("CO2-Wert: " + co2Sensor.getState());
        if(co2Sensor.getState() >= 800) {
            System.out.println("WARNING!");
        }
    }
        
}
