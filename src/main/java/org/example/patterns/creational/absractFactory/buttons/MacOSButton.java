package org.example.patterns.creational.absractFactory.buttons;

/*
     All product families have the same button variations (MacOS/Windows).
     This is the MacOS button variation.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
