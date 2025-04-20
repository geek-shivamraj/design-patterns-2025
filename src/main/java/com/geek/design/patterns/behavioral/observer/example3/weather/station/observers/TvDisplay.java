package com.geek.design.patterns.behavioral.observer.example3.weather.station.observers;

public class TvDisplay implements DisplayObserver {

    @Override
    public void update(String weather) {
        System.out.println("Tv Display: Weather updated - " + weather);
    }
}
