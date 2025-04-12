package com.geek.design.patterns.creational.factory.example2.problem;

import com.geek.design.patterns.creational.factory.example2.FourWheeler;
import com.geek.design.patterns.creational.factory.example2.ThreeWheeler;
import com.geek.design.patterns.creational.factory.example2.TwoWheeler;
import com.geek.design.patterns.creational.factory.example2.Vehicle;
/*
    Problems:
    1. The Client class creates TwoWheeler, FourWheeler objects directly based on input.
        - This strong dependency makes the code hard to maintain or update.
    2. The Client class not only decides which vehicle to create but also handles its lifecycle as object is created here using new.
        - This mixes responsibilities, which goes against the principle that a class should only have one reason to change.
    3. To add a new vehicle type, we must modify the client class, which makes it difficult to scale the design
        - This conflicts with the idea that classes should be open for extension but closed for modification.
 */
public class Client {

    private final Vehicle vehicle;

    public Client(int type) {
        if(type == 1) {
            vehicle = new TwoWheeler();
        } else if (type == 2) {
            vehicle = new ThreeWheeler();
        } else if (type == 3) {
            vehicle = new FourWheeler();
        } else {
            throw new IllegalArgumentException("Unknown Vehicle");
        }
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
