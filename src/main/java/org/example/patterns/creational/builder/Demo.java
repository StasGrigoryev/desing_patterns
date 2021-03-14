package org.example.patterns.creational.builder;

import org.example.patterns.creational.builder.builders.CarBuilder;
import org.example.patterns.creational.builder.builders.CarManualBuilder;
import org.example.patterns.creational.builder.cars.Car;
import org.example.patterns.creational.builder.cars.Manual;
import org.example.patterns.creational.builder.director.Director;

/*
    The class where all brought together
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director receives concrete builder object form client (application)
        // Application knows which builder to use to get the right product
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Builder is the one who returns the final product because director
        // often does not know concrete builder and product classes
        // and does not depend on them
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may now of more than one building recipe
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
