package com.geek.design.patterns.creational.builder.example2.builders;

import com.geek.design.patterns.creational.builder.example2.components.GPSNavigator;
import com.geek.design.patterns.creational.builder.example2.components.Transmission;
import com.geek.design.patterns.creational.builder.example2.components.TripComputer;
import com.geek.design.patterns.creational.builder.example2.product.CarType;
import com.geek.design.patterns.creational.builder.example2.components.Engine;

public interface Builder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
