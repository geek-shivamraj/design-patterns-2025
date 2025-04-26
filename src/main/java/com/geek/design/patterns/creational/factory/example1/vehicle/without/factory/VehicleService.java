package com.geek.design.patterns.creational.factory.example1.vehicle.without.factory;

import com.geek.design.patterns.creational.factory.example1.vehicle.without.factory.product.concrete.FourWheeler;
import com.geek.design.patterns.creational.factory.example1.vehicle.without.factory.product.concrete.ThreeWheeler;
import com.geek.design.patterns.creational.factory.example1.vehicle.without.factory.product.concrete.TwoWheeler;
import com.geek.design.patterns.creational.factory.example1.vehicle.without.factory.product.Vehicle;
import lombok.Data;

/*
    Problems:
        1. The Client/VehicleService class creates TwoWheeler, FourWheeler objects directly based on input.
            - This strong dependency makes the code hard to maintain or update.
        2. The Client/VehicleService class not only decides which vehicle to create but also handles its lifecycle as object is created here using new.
            - This mixes responsibilities, which goes against the principle that a class should only have one reason to change.
        3. To add a new vehicle type, we must modify the client/VehicleService class, which makes it difficult to scale the design
            - This conflicts with the idea that classes should be open for extension but closed for modification.
 */

@Data
public class VehicleService {

    private final Vehicle vehicle;

    public VehicleService(VehicleType vehicleType) {
        if (VehicleType.TWO_WHEELER.equals(vehicleType)) {
            vehicle = new TwoWheeler();
        } else if (VehicleType.THREE_WHEELER.equals(vehicleType)) {
            vehicle = new ThreeWheeler();
        } else if (VehicleType.FOUR_WHEELER.equals(vehicleType)) {
            vehicle = new FourWheeler();
        } else {
            throw new IllegalArgumentException("Unknown Vehicle Type");
        }
    }

    public void useVehicle() {
        // Some logic
        vehicle.printVehicle();
        // Some logic
    }

}
