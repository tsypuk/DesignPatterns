package gof.creational.abstractfactory;

import gof.creational.factory.*;

/**
 * Created by rtsy on 20.02.2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}