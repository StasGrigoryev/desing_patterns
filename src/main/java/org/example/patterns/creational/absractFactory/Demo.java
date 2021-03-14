package org.example.patterns.creational.absractFactory;

import org.example.patterns.creational.absractFactory.app.Application;
import org.example.patterns.creational.absractFactory.factories.GUIFactory;
import org.example.patterns.creational.absractFactory.factories.MacOSFactory;
import org.example.patterns.creational.absractFactory.factories.WindowsFactory;

/*
     Demo class where all brings together
 */
public class Demo {

    /*
        The app chooses the type and creates concrete factories dynamically based on
        configuration or environment
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
