package org.example.patterns.structural.brdige.remotes;

import org.example.patterns.structural.brdige.devices.Device;
import org.example.patterns.structural.brdige.devices.Radio;
import org.example.patterns.structural.brdige.devices.Tv;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
