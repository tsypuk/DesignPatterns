package gof.creational.abstractfactory.impl;

import gof.creational.abstractfactory.Shape;

/**
 * Created by rtsy on 20.02.2016.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw.");
    }
}
