package org.example.patterns.creational.absractFactory.checkboxes;

/*
     All product families have the same checkbox variations (MacOS/Windows).
     This is the MacOS checkbox variation.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
