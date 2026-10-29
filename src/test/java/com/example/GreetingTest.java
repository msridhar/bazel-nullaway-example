package com.example;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingTest {
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private PrintStream originalOut;
    private PrintStream capturedOut;

    @Before
    public void captureOutput() {
        originalOut = System.out;
        capturedOut = new PrintStream(output, true, StandardCharsets.UTF_8);
        System.setOut(capturedOut);
    }

    @After
    public void restoreOutput() {
        System.setOut(originalOut);
        capturedOut.close();
    }

    @Test
    public void sayHiPrintsGreeting() {
        Greeting.sayHi();

        assertEquals("Hi!" + System.lineSeparator(), output.toString(StandardCharsets.UTF_8));
    }

    @Test
    public void testMapWithEmptyMapProducesNoOutput() {
        Greeting.testMap("missing-key");

        assertEquals("", output.toString(StandardCharsets.UTF_8));
    }
}
