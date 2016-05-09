package gof.structural.decorator.impl;

import gof.structural.decorator.Shape;

/**
 * Created by rtsy on 21.03.2016.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
