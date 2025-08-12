package com.geek.design.patterns.creational.builder.example2.builders;

import com.geek.design.patterns.creational.builder.example2.components.Engine;
import com.geek.design.patterns.creational.builder.example2.components.GPSNavigator;
import com.geek.design.patterns.creational.builder.example2.components.Transmission;
import com.geek.design.patterns.creational.builder.example2.components.TripComputer;
import com.geek.design.patterns.creational.builder.example2.product.Car;
import com.geek.design.patterns.creational.builder.example2.product.CarType;
import lombok.Setter;

public class CarBuilder implements Builder{

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    @Override
    public void setCarType(CarType carType) {
        this.type = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
