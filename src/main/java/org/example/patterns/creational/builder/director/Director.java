package org.example.patterns.creational.builder.director;

import org.example.patterns.creational.builder.builders.Builder;
import org.example.patterns.creational.builder.cars.CarType;
import org.example.patterns.creational.builder.components.Engine;
import org.example.patterns.creational.builder.components.GPSNavigator;
import org.example.patterns.creational.builder.components.Transmission;
import org.example.patterns.creational.builder.components.TripComputer;

/*
    Director knows in what sequence builder should work. He works with him
    through the Builder interface. So he may not know what concrete product
    he is building now.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
