package com.coherentsolutions.advanced.java.behavioral.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(26.6f, 65, 1013.1f);
        weatherData.setMeasurements(27.2f, 70, 1012.5f);
        weatherData.setMeasurements(25.5f, 90, 1012.9f);
    }
}
