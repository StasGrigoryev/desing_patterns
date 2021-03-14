package org.example.patterns.creational.absractFactory.factories;

import org.example.patterns.creational.absractFactory.buttons.Button;
import org.example.patterns.creational.absractFactory.buttons.MacOSButton;
import org.example.patterns.creational.absractFactory.checkboxes.Checkbox;
import org.example.patterns.creational.absractFactory.checkboxes.MacOSCheckbox;

/*
    Every concrete factory knows and creates only the products of its variation
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
