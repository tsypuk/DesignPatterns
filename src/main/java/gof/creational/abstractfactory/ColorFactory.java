package gof.creational.abstractfactory;

import gof.creational.abstractfactory.impl.Blue;
import gof.creational.abstractfactory.impl.Green;
import gof.creational.abstractfactory.impl.Red;

/**
 * Created by rtsy on 20.02.2016.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String colorName) {
        Color color = null;
        switch (colorName.toUpperCase()) {
            case "RED":
                color = new Red();
                break;
            case "GREEN":
                color = new Green();
                break;
            case "BLUE":
                color = new Blue();
                break;
        }
        return color;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}