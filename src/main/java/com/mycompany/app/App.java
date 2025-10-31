package com.mycompany.app;

public class App {

    private static final String MESSAGE = "Hello World!";

    private int counter;

    public App() {
        this.counter = 0;
    }

    public static String getStaticMessage() {
        return MESSAGE;
    }

    public String getMessage() {
        return MESSAGE;
    }

    public int incrementCounter() {
        return ++counter;
    }

    public int resetCounter() {
        counter = 0;
        return counter;
    }

    public boolean isMessageHelloWorld() {
        return MESSAGE.equals("Hello World!");
    }
}
