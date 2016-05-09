package gof.creational.abstractfactory;

import gof.creational.abstractfactory.impl.Circle;
import gof.creational.abstractfactory.impl.Rectangle;
import gof.creational.abstractfactory.impl.Square;

/**
 * Created by rtsy on 20.02.2016.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shapeName) {
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