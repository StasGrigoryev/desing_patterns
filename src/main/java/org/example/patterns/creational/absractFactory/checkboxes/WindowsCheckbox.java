package org.example.patterns.creational.absractFactory.checkboxes;

/*
     All product families have the same checkbox variations (MacOS/Windows).
     This is the Windows checkbox variation.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}