package com.functional.programming.with.lambda.expressions;

import com.functional.programming.with.interfaces.Greeting;

import java.util.Date;

public class GreeterWithLambdas {

    public void greet(Greeting g){
        g.perform();
    }

    public static void main(String[] args) {
        GreeterWithLambdas g = new GreeterWithLambdas();
        Greeting helloWorldLambda = () -> System.out.print("Hello World With Lambda");
        g.greet(helloWorldLambda);


    }



}
