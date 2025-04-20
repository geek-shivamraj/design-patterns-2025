package com.geek.design.patterns.behavioral.observer.example3.weather.station.observerable;

import com.geek.design.patterns.behavioral.observer.example3.weather.station.observers.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationTwo implements WeatherStation {

    private final List<DisplayObserver> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(DisplayObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(DisplayObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(DisplayObserver d : observers) {
            d.update("Message from Weather Station 2: " + weather);
        }
    }

    @Override
    public void setWeather(String weather) {
        this.weather = weather;
        notifyObservers();
    }
}
