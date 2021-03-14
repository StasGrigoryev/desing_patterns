package org.example.patterns.structural.composite;

import org.example.patterns.structural.composite.editor.ImageEditor;
import org.example.patterns.structural.composite.shapes.Circle;
import org.example.patterns.structural.composite.shapes.CompoundShape;
import org.example.patterns.structural.composite.shapes.Dot;
import org.example.patterns.structural.composite.shapes.Rectangle;

import java.awt.Color;


public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(120, 120, 70, Color.ORANGE),
                        new Dot(180, 180, Color.ORANGE),
                        new CompoundShape(new Circle(110, 110, 50, Color.RED),
                                new Dot(160, 160, Color.RED))
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
