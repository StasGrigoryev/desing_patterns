package org.example.patterns.creational.factoryMethod;

import org.example.patterns.creational.factoryMethod.factories.Dialog;
import org.example.patterns.creational.factoryMethod.factories.HtmlDialog;
import org.example.patterns.creational.factoryMethod.factories.MacOSDialog;

public class Demo {
    //factory variable
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();

    }

    /*
        The application creates particular factory depending on configuration or environment
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new MacOSDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /*
        The rest of the client's code uses common interface
        to interact with the products regardless which factory was created
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
