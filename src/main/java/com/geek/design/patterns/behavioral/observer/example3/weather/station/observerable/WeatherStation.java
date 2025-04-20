package com.geek.design.patterns.behavioral.observer.example3.weather.station.observerable;


import com.geek.design.patterns.behavioral.observer.example3.weather.station.observers.DisplayObserver;

public interface WeatherStation {
    void addObserver(DisplayObserver o);
    void removeObserver(DisplayObserver o);
    void notifyObservers();
    void setWeather(String weather);
}
