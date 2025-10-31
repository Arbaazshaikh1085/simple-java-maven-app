package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest { // Removed 'public' modifier

    @Test
    void testAppConstructor() { // Removed 'public'
        App app = new App();
        assertEquals(0, app.incrementCounter() - 1);
    }

    @Test
    void testAppMessage() { // Removed 'public'
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    void testStaticMessage() { // Removed 'public'
        assertEquals("Hello World!", App.getStaticMessage());
    }

    @Test
    void testCounterIncrement() { // Removed 'public'
        App app = new App();
        assertEquals(1, app.incrementCounter());
        assertEquals(2, app.incrementCounter());
    }

    @Test
    void testCounterReset() { // Removed 'public'
        App app = new App();
        app.incrementCounter();
        app.incrementCounter();
        assertEquals(0, app.resetCounter());
    }

    @Test
    void testIsMessageHelloWorld() { // Removed 'public'
        App app = new App();
        assertTrue(app.isMessageHelloWorld());
    }

    @Test
    void testMessageEquals() {
        App app = new App();
        assertTrue(app.messageEquals("Hello World!"));
        assertFalse(app.messageEquals("Other Message"));
    }
}
