package org.example.patterns.creational.absractFactory.factories;

import org.example.patterns.creational.absractFactory.buttons.Button;
import org.example.patterns.creational.absractFactory.buttons.WindowsButton;
import org.example.patterns.creational.absractFactory.checkboxes.Checkbox;
import org.example.patterns.creational.absractFactory.checkboxes.WindowsCheckbox;

/*
    Every concrete factory knows and creates only the products of its own variation
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
