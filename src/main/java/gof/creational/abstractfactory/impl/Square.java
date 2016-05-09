package gof.creational.abstractfactory.impl;

import gof.creational.abstractfactory.Shape;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw.");
    }
}
