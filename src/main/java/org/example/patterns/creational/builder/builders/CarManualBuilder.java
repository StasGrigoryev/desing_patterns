package org.example.patterns.creational.builder.builders;

import org.example.patterns.creational.builder.cars.CarType;
import org.example.patterns.creational.builder.cars.Manual;
import org.example.patterns.creational.builder.components.Engine;
import org.example.patterns.creational.builder.components.GPSNavigator;
import org.example.patterns.creational.builder.components.Transmission;
import org.example.patterns.creational.builder.components.TripComputer;

/*
    Unlike other creational patterns Builders can create completely different
    products that does not have common interface

    In this case we are creating user manual same way as cars.
    This will allow us to create manuals for concrete car models that have various features.
 */
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
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

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
