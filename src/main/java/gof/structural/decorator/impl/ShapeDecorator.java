package gof.structural.decorator.impl;

import gof.structural.decorator.Shape;

/**
 * Created by rtsy on 21.03.2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}