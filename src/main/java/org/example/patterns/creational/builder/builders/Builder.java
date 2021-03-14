package org.example.patterns.creational.builder.builders;

import org.example.patterns.creational.builder.cars.CarType;
import org.example.patterns.creational.builder.components.Engine;
import org.example.patterns.creational.builder.components.GPSNavigator;
import org.example.patterns.creational.builder.components.Transmission;
import org.example.patterns.creational.builder.components.TripComputer;

/*
    The Builder interface declares all the possible stages and steps
    of the product configuration
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
