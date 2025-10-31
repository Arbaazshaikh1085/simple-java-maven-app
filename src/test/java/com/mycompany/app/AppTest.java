package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAppConstructor() {
        App app = new App();
        assertEquals(0, app.incrementCounter() - 1); // counter initialized to 0
    }

    @Test
    public void testAppMessage() {
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testStaticMessage() {
        assertEquals("Hello World!", App.getStaticMessage());
    }

    @Test
    public void testCounterIncrement() {
        App app = new App();
        assertEquals(1, app.incrementCounter());
        assertEquals(2, app.incrementCounter());
    }

    @Test
    public void testCounterReset() {
        App app = new App();
        app.incrementCounter();
        app.incrementCounter();
        assertEquals(0, app.resetCounter());
    }

    @Test
    public void testIsMessageHelloWorld() {
        App app = new App();
        assertTrue(app.isMessageHelloWorld());
    }
}
