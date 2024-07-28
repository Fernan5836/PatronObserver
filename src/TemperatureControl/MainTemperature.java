package TemperatureControl;

public class MainTemperature {
    public static void main(String[] args) {
        // Creamos una instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Creamos instancias de los observadores
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        // Agregamos los observadores a la estación meteorológica
        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);

        // Simulamos cambios en la temperatura
        weatherStation.setTemperature(34);
        weatherStation.setTemperature(46);
    }
}
