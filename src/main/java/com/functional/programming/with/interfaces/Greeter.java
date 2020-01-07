package com.functional.programming.with.interfaces;

public class Greeter {
    public void greet(Greeting g){
        g.perform();
    }


    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.greet(new HelloWorldGreeting());
    }

}
