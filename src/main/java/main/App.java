package main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TemperaturSensor sensor = new TemperaturSensor();
        TemperaturAnzeige anzeige = new TemperaturAnzeige(sensor);
        TemperaturWebAnsicht webansicht = new TemperaturWebAnsicht(sensor);
        TemperaturWetterStation station = new TemperaturWetterStation(sensor);

        sensor.setState(20);
        sensor.setState(21);
        sensor.remove(anzeige);
        sensor.setState(25);
        sensor.notifyAllObservers();

        CO2Sensor co2Sensor = new CO2Sensor();
        CO2Anzeige co2Anzeige = new CO2Anzeige(co2Sensor);
        
        co2Sensor.setState(123);
        co2Sensor.setState(900);

        MultiAnzeige multiAnzeige = new MultiAnzeige(sensor, co2Sensor);
        co2Sensor.notifyAllObservers();
    }   
}
