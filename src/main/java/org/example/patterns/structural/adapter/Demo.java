package org.example.patterns.structural.adapter;

import org.example.patterns.structural.adapter.adapters.SquarePegAdapter;
import org.example.patterns.structural.adapter.round.RoundHole;
import org.example.patterns.structural.adapter.round.RoundPeg;
import org.example.patterns.structural.adapter.square.SquarePeg;

/*
    In client's code
 */
public class Demo {
    public static void main(String[] args) {
        // Round to round - everything is working well
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Compile time error

        // Adapter solves the problem
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}

