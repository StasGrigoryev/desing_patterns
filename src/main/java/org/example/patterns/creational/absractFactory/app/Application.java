package org.example.patterns.creational.absractFactory.app;

import org.example.patterns.creational.absractFactory.buttons.Button;
import org.example.patterns.creational.absractFactory.checkboxes.Checkbox;
import org.example.patterns.creational.absractFactory.factories.GUIFactory;

/*
    Client code doesn't care which concrete factory it works with
    All the product receivers works with products through the abstract interface
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
