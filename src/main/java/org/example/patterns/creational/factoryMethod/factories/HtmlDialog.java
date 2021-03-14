package org.example.patterns.creational.factoryMethod.factories;

import org.example.patterns.creational.factoryMethod.buttons.Button;
import org.example.patterns.creational.factoryMethod.buttons.HtmlButton;

//this class is a concrete creator
public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
