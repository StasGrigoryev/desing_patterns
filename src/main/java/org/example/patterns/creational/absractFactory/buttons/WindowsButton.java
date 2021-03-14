package org.example.patterns.creational.absractFactory.buttons;

/*
     All product families have the same button variations (MacOS/Windows).
     This is the Windows button variation.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
