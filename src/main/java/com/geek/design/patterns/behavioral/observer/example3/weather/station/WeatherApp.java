package com.geek.design.patterns.behavioral.observer.example3.weather.station;

import com.geek.design.patterns.behavioral.observer.example3.weather.station.observerable.WeatherStationOne;
import com.geek.design.patterns.behavioral.observer.example3.weather.station.observerable.WeatherStationTwo;
import com.geek.design.patterns.behavioral.observer.example3.weather.station.observers.PhoneDisplay;
import com.geek.design.patterns.behavioral.observer.example3.weather.station.observers.TvDisplay;

public class WeatherApp {
    public static void main(String[] args) {

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        TvDisplay tvDisplay = new TvDisplay();

        WeatherStationOne weatherStationOne = new WeatherStationOne();
        weatherStationOne.addObserver(phoneDisplay);
        weatherStationOne.addObserver(tvDisplay);

        weatherStationOne.setWeather("Sunny Weather Today");

        WeatherStationTwo weatherStationTwo = new WeatherStationTwo();
        weatherStationTwo.addObserver(tvDisplay);

        weatherStationTwo.setWeather("Chilly Weather Today");
    }
}
