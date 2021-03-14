package org.example.patterns.behavioural.chainOfResponsibility.server;

import org.example.patterns.behavioural.chainOfResponsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

/*
 * Server class
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /*
     *
     * Client passes assembled chain to the server. This increases the flexibility and
     * makes easier testing of the server class.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /*
     *
     * Server receives an email and a password from a client and then starts the chain's
     * checking and authorization operations
     */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // Here should be some useful code working for
            // authorized users only

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
