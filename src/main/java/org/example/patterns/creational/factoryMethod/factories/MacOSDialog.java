package org.example.patterns.creational.factoryMethod.factories;

import org.example.patterns.creational.factoryMethod.buttons.Button;
import org.example.patterns.creational.factoryMethod.buttons.MacOSButton;

//this class is another concrete creator
public class MacOSDialog extends Dialog{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
