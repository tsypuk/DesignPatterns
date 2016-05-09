package gof.structural.flyweight.impl;

import gof.structural.flyweight.Shape;

/**
 * Created by rtsy on 21.03.2016.
 */
public class Circle implements Shape {
    private String color;

    public Circle(String color){
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}