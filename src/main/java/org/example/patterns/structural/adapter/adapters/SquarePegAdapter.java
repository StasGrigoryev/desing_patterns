package org.example.patterns.structural.adapter.adapters;

import org.example.patterns.structural.adapter.round.RoundPeg;
import org.example.patterns.structural.adapter.square.SquarePeg;

/*
    Adapter allows us to use SquarePegs and RoundHoles together
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate the min radius that can fit a peg
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
