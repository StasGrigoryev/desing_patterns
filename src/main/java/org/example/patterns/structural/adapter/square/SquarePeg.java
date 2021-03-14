package org.example.patterns.structural.adapter.square;

/*
    SquarePegs are incompatible with RoundHoles (they are legacy from former employees).
    But we have to integrate them into our system.
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
