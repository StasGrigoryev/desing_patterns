package org.example.patterns.creational.singleton.concurrentSingleton;

public final class Singleton {

    // The field must be declared as volatile so double checked locking
    // worked as expected
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // Double Check Locking
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}