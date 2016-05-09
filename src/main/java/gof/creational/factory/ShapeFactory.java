package gof.creational.factory;

import gof.creational.factory.impl.Circle;
import gof.creational.factory.impl.Rectangle;
import gof.creational.factory.impl.Square;

/**
 * Created by rtsy on 20.02.2016.
 */
public class ShapeFactory {

    public static Shape getShape(String shapeName)
            throws InterruptedException {
        Shape shape;
        switch (shapeName.toUpperCase()) {
            case "CIRCLE":
                shape = new Circle();
                break;
            case "SQUARE":
                shape = new Square();
                break;
            case "RECTANGLE":
                shape = new Rectangle();
                break;
            default:
                throw new IllegalArgumentException("Not supported type " + shapeName);
        }
        return shape;
    }
}