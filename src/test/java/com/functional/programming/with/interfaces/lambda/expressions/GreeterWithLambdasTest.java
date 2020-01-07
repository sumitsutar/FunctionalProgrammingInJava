package com.functional.programming.with.interfaces.lambda.expressions;

import com.functional.programming.with.interfaces.Greeter;
import com.functional.programming.with.interfaces.HelloWorldGreeting;
import com.functional.programming.with.lambda.expressions.GreeterWithLambdas;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GreeterWithLambdasTest {
    static GreeterWithLambdas g;
    static HelloWorldGreeting h;

    @BeforeClass
    public static void setup(){
        g = new GreeterWithLambdas();
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
        GreeterWithLambdas.main(new String[]{});
        assertEquals("Hello World With Lambda",outContent.toString());
    }

}
