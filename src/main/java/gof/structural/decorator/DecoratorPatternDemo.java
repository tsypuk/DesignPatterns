package gof.structural.decorator;

import gof.structural.decorator.impl.Circle;
import gof.structural.decorator.impl.Rectangle;
import gof.structural.decorator.impl.RedShapeDecorator;

/**
 * Created by rtsy on 21.03.2016.
 * The Decorator Patternattaches additional responsibilities to an object dynamically.
 * Decorators provide a fl exible alternative to subclassing for extending functionality.
 * Decorator pattern allows a user to add java8 functionality to an existing object without altering its structure.
 * This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
 * This pattern creates a decorator class which wraps the original class and provides additional functionality
 * keeping class methods signature intact.
 * -java.io.BufferedInputStream(InputStream)
 -java.io.DataInputStream(InputStream)
 -java.io.BufferedOutputStream(OutputStream)
 -java.util.zip.ZipOutputStream(OutputStream)
 -java.util.Collections#checked[List|Map|Set|SortedSet|SortedMap]()
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}