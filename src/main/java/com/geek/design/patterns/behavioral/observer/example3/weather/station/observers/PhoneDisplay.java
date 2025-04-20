package com.geek.design.patterns.behavioral.observer.example3.weather.station.observers;

public class PhoneDisplay implements DisplayObserver {

    @Override
    public void update(String weather) {
        System.out.println("Phone Display: Weather updated - " + weather);
    }

}
