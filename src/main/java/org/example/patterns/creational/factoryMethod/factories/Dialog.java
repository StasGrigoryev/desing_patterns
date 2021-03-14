package org.example.patterns.creational.factoryMethod.factories;

/*
     Factory base class. Note that "factory" is not the main role of this class.
     It already has some business-logic which requires instances.
*/


import org.example.patterns.creational.factoryMethod.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        // ... the rest dialog's code ...

        Button okButton = createButton();
        okButton.render();
    }

    /*
        Subclasses will override this method to create instances of products,
        particular instance for each concrete factory.
        Product interface (Button) is a return type.
     */
    public abstract Button createButton();

}
