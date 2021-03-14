package org.example.patterns.creational.absractFactory.factories;

import org.example.patterns.creational.absractFactory.buttons.Button;
import org.example.patterns.creational.absractFactory.checkboxes.Checkbox;

/*
    Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
