package org.example.patterns.structural.adapter.round;

/*
    RoundPeg is compatible with RoundHoles
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
