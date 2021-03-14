package org.example.patterns.creational.absractFactory.buttons;

/*
    The pattern assumes that you have a several families of products
    placed in different class hierarchies (Button/Checkbox).
    Products of one family should have a common interface.

    This is the common interface for the buttons product family
 */
public interface Button {
    void paint();
}
