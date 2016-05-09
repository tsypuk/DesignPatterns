package gof.structural.facade.impl;

import gof.structural.facade.Shape;

/**
 * Created by rtsy on 21.03.2016.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}