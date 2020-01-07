package com.functional.programming.with.interfaces;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class HelloWorldGreetingTest {

    @Test
    public void testPerform(){
        HelloWorldGreeting h =new HelloWorldGreeting();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        h.perform();
        assertEquals("Hellow",outContent.toString());
    }
}
