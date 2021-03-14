package org.example.patterns.structural.flyweight.trees;

import java.awt.*;

//object that needs to be lightweighted (context)
public class Tree {
    private int x;
    private int y;
    //link to a lightweight instance
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
