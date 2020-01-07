package com.functional.programming.with.interfaces;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GreeterTest {
    static Greeter g;
    static HelloWorldGreeting h;

    @BeforeClass
    public static void setup(){
        g = new Greeter();
        h =new HelloWorldGreeting();

    }

    @Test
    public void testGreet() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        g.greet(h);
        assertEquals("Hellow",outContent.toString());
    }

    @Test
    public void testMain() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Greeter.main(new String[]{});
        assertEquals("Hellow",outContent.toString());
    }

}
