package com.functional.programming.with.interfaces;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.print("Hellow");
    }
}
